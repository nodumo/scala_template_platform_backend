package org.mastermold.platform.application.definitions

/**
  * Application transaction script algebra.
  *
  * @author Grumpy Cat (grumpycat@codekitt.com)
  * @tparam F Effect
  * @tparam InputEvent Input event
  * @tparam DataTransmissionObject Data-transmission objects
  */
trait IntegrationTransactionScriptServiceAlgebra[F[_], InputEvent <: Event[_], DataTransmissionObject] extends IntegrationServiceAlgebra[F,InputEvent, DataTransmissionObject]