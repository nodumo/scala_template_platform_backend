package org.mastermold.platform.application.definitions.interpreters

import cats.syntax.functor._
import cats.syntax.flatMap._
import cats.effect.Async
import org.mastermold.platform.application.definitions.{Event, IntegrationRunnerServiceAlgebra, IntegrationServiceAlgebra, Result}
import org.mastermold.platform.common.logging.ShowLoggable
import org.mastermold.platform.infrastructure.logging.LoggingServiceAlgebra

/**
  * Application Cats-Effect runner.
  *
  * @author Nick Odumo (nodumo@nodumo.com
  * @tparam F          Effect (Cats-effect constrained monad)
  * @tparam InputEvent Input event
  * @tparam DTO        Data-transmission objects
  * @param loggingService Logging service
  */
class IntegrationRunnerServiceCatsEffectInterpreter[F[_] : Async, InputEvent <: Event[_] : ShowLoggable, DTO: ShowLoggable](
                                                                                                                             loggingService: LoggingServiceAlgebra[F, String]) extends IntegrationRunnerServiceAlgebra[F, InputEvent, DTO] {

  override def runIntegration(integrationService: IntegrationServiceAlgebra[F, InputEvent, DTO])(event: InputEvent): F[Result[DTO]] =
    for {
      _ <- loggingService.info("Running application usecase.")
      result <- integrationService.execute(event)
      _ <- loggingService.info("Completed application usecase.")
    } yield result

}

