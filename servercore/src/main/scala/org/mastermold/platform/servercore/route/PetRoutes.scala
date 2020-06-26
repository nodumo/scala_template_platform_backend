package org.mastermold.platform.servercore.route

import cats.Applicative
import cats.effect.Effect
import org.http4s.rho.swagger.SwaggerSyntax
import org.http4s.rho.{PathBuilder, RhoService}
import org.http4s.{EntityDecoder, Uri}
import shapeless.HNil

object PetRoutes {

  def getMeToCompileRoute[F[_]: Effect]: RhoService[F] = {

    val swaggerSyntax = new SwaggerSyntax[F] {}
    import swaggerSyntax._

    new RhoService[F] {
      "We don't want to have a real 'root' route anyway... " **
      GET |>> TemporaryRedirect(Uri(path = "/swagger-ui"))(Applicative[F])
    }
  }

  def petRoute[F[_]](implicit F: Effect[F]): F[RhoService[F]] =
    for {
      counter <- fs2.async.refOf[F, Int](0)(F)
    } yield {
      val swaggerSyntax = new SwaggerSyntax[F] {}
      import swaggerSyntax._

      new RhoService[F] {

        val hello: PathBuilder[F, HNil] = GET / "hello"

        "Simple hello world route" **
        hello |>> Ok(ResponseMessage("Hello world!"))

        "Returns Hellow Based on Request" **
        hello / pathVar[String] |>> { name: String =>
          Ok(ResponseMessage(s"Hello, $name"))
        }

        val pet: PathBuilder[F, HNil] = GET / "pet"

        "A variant of the hello route that takes an Int param" **
        pet / pathVar[Int] |>> { i: Int =>
          Ok(ResponseMessage(s"You returned $i"))
        }

        "Default Pet" **
        pet |>> { Ok(Models.Pet("name", Models.Red)) }

        "This gets a simple counter for the number of times this route has been requested" **
        GET / "counter" |>> {
          counter.modify(_ + 1).map(_.now).flatMap(i => Ok(ResponseMessage(s"The number is $i")))
        }

        "Consume A Json Message" **
        POST / "echo" ^ EntityDecoder[F, ResponseMessage] |>> { rm: ResponseMessage =>
          Ok(rm)
        }
      }

    }

}
