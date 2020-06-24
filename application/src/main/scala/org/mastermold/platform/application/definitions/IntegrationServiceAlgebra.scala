package org.mastermold.platform.application.definitions

trait IntegrationServiceAlgebra [F[_],InputEvent <: Event[_], DTO] {

  def runIntegration(event: InputEvent): F[Result[DTO]]

}
