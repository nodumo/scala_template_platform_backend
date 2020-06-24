package org.mastermold.platform.application.definitions

trait IntegrationServiceAlgebra [F[_],InputEvent <: Event[_], DTO] {

  def execute(event: InputEvent): F[Result[DTO]]

}
