package org.mastermold.platform.application.definitions

trait IntegrationRunnerServiceAlgebra[F[_],InputEvent <: Event[_], DTO] {

  def runIntegration(event: InputEvent): F[DTO]

}
