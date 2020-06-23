package org.mastermold.platform.common.softwarepatterns

/**
 * Factory service bijection algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam LeftSide Left side
 * @tparam RightSide Right side
 */
trait FactoryServiceBijectionAlgebra[LeftSide, RightSide] {

  def goRightSide(leftSide: LeftSide): RightSide

  def goLeftSide(rightSide: RightSide): LeftSide

}
