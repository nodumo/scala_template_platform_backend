package org.mastermold.platform.infrastructure.http.interpreters

abstract class JsonClientHTT4SInterpreter
/*

https://github.com/RawToast/http4s-twirl-example/blob/master/src/main/scala/hygiene/client/JsonClient.scala
https://github.com/RawToast/http4s-twirl-example/blob/master/src/main/scala/hygiene/services/EstablishmentService.scala

import fs2.Task
import io.circe.Json
import org.http4s.Status.Successful
import org.http4s._
import org.http4s.circe._
import org.http4s.client.Client
import org.http4s.dsl._
import org.log4s._

class JsonClientHTT4SInterpreter(client: Client, baseUri:Uri){

  lazy val logger: Logger = getLogger

  def fetch(path: String): Task[Json] = {

    client.fetch[Json](Request(GET, baseUri.withPath(path), headers = Headers(Header("x-api-version", "2")))) { (r: Response) =>
      r.status.responseClass match {
        case Successful =>
          logger.info(s"Call to uri=$path returned successfully")
          r.as[Json]
        case _ => logger.warn(s"Call to uri=$path did not return a successful response code=${r.status.code}")
          r.as[Json]
      }
    }
  }

}

 */
