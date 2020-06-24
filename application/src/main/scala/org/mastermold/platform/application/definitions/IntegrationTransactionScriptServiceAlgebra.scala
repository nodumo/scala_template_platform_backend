package org.mastermold.platform.application.definitions

/**
  * Application transaction script algebra.
  *
  * @author Nick Odumo (nodumo@nodumo.com
  * @tparam F Effect
  * @tparam InputEvent Input event
  * @tparam DTO Data-transmission objects
  */
trait IntegrationTransactionScriptServiceAlgebra[F[_], InputEvent <: Event[_], DTO] {

  def execute(event: InputEvent): F[DTO]

}
