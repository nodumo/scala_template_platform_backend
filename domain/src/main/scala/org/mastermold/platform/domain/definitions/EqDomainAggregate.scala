package org.mastermold.platform.domain.definitions

/**
 * Equality for domain-aggregate.
 *
 * @author Grumpy Cat (nodumowebdev@gmail.com)
 * @tparam V Domain value
 * @tparam A Domain Aggregate
 */
trait EqDomainAggregate[V <: DomainValue, A[_] <: DomainAggregate[V]] {

  def equal(leftA: A[V], rightA: A[V]): Boolean

}
