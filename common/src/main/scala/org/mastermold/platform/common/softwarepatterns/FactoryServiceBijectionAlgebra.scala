package org.mastermold.platform.common.softwarepatterns

/**
 * Factory service bijection algebra.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam LeftSide Left side
 * @tparam RightSide Right side
 */
trait FactoryServiceBijectionAlgebra[LeftSide, RightSide] {

  def goRightSide(leftSide: LeftSide): RightSide

  def goLeftSide(rightSide: RightSide): LeftSide

}
