package org.mastermold.platform.application.definitions

/**
  * Application transaction script algebra.
  *
  * @author Grumpy Cat (grumpycat@codekitt.com
  * @usecase Modelling the application input
  * @tparam F Effect
  * @tparam InputEvent Input event
  * @tparam DTO Data-transmission objects
  */
trait IntegrationUsecaseServiceAlgebra[F[_], InputEvent <: Event[_], DTO] extends IntegrationServiceAlgebra[F,InputEvent, DTO]
