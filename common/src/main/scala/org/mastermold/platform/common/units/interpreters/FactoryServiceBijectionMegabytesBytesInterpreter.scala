package org.mastermold.platform.common.units.interpreters

import org.mastermold.platform.common.units.{ Bytes, FactoryServiceBijectionMegabytesBytesAlgebra, Megabytes }

/**
 * Bijection between values.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @usecase Common translation tool for translating between bytes count and megabytes count
 */
final class FactoryServiceBijectionMegabytesBytesInterpreter
    extends FactoryServiceBijectionMegabytesBytesAlgebra[Megabytes, Bytes] {

  private val bytesInAMegabyte: Long = 1000000

  override def goLeftSide(rightSide: Bytes): Megabytes = Megabytes(rightSide.value * bytesInAMegabyte)

  override def goRightSide(leftSide: Megabytes): Bytes = Bytes(leftSide.value / bytesInAMegabyte)

}

object FactoryServiceBijectionMegabytesBytesInterpreter {

  def apply: FactoryServiceBijectionMegabytesBytesInterpreter =
    new FactoryServiceBijectionMegabytesBytesInterpreter()

}
