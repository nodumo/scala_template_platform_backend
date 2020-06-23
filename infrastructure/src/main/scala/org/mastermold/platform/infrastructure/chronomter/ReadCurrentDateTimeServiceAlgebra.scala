package org.mastermold.platform.infrastructure.chronomter

trait ReadCurrentDateTimeServiceAlgebra[F[_], CurrentTime] {

  def readCurrentTimeEffect[A]: F[CurrentTime]

}
