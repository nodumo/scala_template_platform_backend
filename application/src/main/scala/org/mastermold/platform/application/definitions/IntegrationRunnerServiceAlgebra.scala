package org.mastermold.platform.application.definitions

trait IntegrationRunnerServiceAlgebra[F[_], InputEvent <: Event[_], DTO] {

  def runIntegration(integrationService: IntegrationServiceAlgebra[F, InputEvent, DTO])(event: InputEvent): F[Result[DTO]]

}
