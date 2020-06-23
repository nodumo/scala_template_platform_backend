package org.mastermold.platform.common.softwarepatterns

/**
 * Factory service bijection algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam From Source
 * @tparam To Target
 */
trait FactoryServiceAlgebra[From, To] {

  def create(from: From): To

}
