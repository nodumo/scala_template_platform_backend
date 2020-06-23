package org.mastermold.platform.common.units

final case class Bytes(value: Bytes.Repr) extends AnyVal

object Bytes {

  type Repr = Long

}
