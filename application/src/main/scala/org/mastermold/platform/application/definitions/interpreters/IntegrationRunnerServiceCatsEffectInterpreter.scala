package org.mastermold.platform.application.definitions.interpreters

import cats.effect.Async
import org.mastermold.platform.application.definitions.{Event, IntegrationRunnerServiceAlgebra, IntegrationServiceAlgebra, Result}

/**
  * Application Cats-Effect runner.
  *
  * @author Nick Odumo (nodumo@nodumo.com
  * @tparam F Effect
  * @tparam InputEvent Input event
  * @tparam DTO Data-transmission objects
  */
class IntegrationRunnerServiceCatsEffectInterpreter[F[_]: Async, InputEvent <: Event[_], DTO] extends IntegrationRunnerServiceAlgebra[F, InputEvent, DTO] {

  override def runIntegration(integrationService: IntegrationServiceAlgebra[F, InputEvent, DTO])(event: InputEvent): F[Result[DTO]] =
    integrationService.execute(event)

}














