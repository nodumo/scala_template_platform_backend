package org.mastermold.platform.application.definitions

/**
  * Application transaction script algebra.
  *
  * @author Grumpy Cat (grumpycat@codekitt.com
  * @tparam F Effect
  * @tparam InputEvent Input event
  * @tparam DTO Data-transmission objects
  */
trait IntegrationTransactionScriptServiceAlgebra[F[_], InputEvent <: Event[_], DTO] extends IntegrationServiceAlgebra[F,InputEvent, DTO]