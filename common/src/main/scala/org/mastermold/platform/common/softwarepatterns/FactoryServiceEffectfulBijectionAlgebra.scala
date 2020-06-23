package org.mastermold.platform.common.softwarepatterns

/**
 * Factory service effectful bijection algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 * @tparam LeftSide Left side
 * @tparam RightSide Right side
 */
trait FactoryServiceEffectfulBijectionAlgebra[F[_], LeftSide, RightSide] {

  def goRightSide(leftSide: LeftSide): F[RightSide]

  def from(rightSide: RightSide): F[LeftSide]

}
