package org.mastermold.platform.domain.definitions

/**
 * Equality for domain-value.
 *
 * @author Nick Odumo (nodumowebdev@gmail.com)
 * @tparam A Domain Aggregate
 */
trait EqDomainValue[A] {

  def equal(leftA: A, rightA: A): Boolean

}
