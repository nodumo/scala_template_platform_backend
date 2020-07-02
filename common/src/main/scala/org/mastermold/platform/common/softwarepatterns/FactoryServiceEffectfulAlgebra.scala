package org.mastermold.platform.common.softwarepatterns

/**
 * Factory service bijection algebra.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam F Effect
 * @tparam From Source
 * @tparam To Target
 */
trait FactoryServiceEffectfulAlgebra[F[_], From, To] {

  def create(from: From): F[To]

}
