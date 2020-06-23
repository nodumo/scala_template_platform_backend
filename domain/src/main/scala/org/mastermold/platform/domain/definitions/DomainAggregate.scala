package org.mastermold.platform.domain.definitions

/**
 * Domain aggregate object.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam AggregateId Base aggregate id
 */
trait DomainAggregate[AggregateId] {

  val aggregateId: AggregateId

}
