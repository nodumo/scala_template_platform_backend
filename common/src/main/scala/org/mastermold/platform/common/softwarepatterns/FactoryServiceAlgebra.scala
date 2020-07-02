package org.mastermold.platform.common.softwarepatterns

/**
 * Factory service bijection algebra.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam From Source
 * @tparam To Target
 */
trait FactoryServiceAlgebra[From, To] {

  def create(from: From): To

}
