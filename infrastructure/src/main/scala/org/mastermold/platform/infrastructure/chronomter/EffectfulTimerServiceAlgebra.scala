package org.mastermold.platform.infrastructure.chronomter

trait EffectfulTimerServiceAlgebra[F[_], TimeMeasurement] {

  def timeEffect[A](f: F[A]): F[TimeMeasurement]

}
