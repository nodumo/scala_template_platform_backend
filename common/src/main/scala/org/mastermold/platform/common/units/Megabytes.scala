package org.mastermold.platform.common.units

final case class Megabytes(value: Megabytes.Repr) extends AnyVal

object Megabytes {

  type Repr = Long

}
