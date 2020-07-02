package org.mastermold.platform.domain.definitions

/**
 * Domain aggregate object.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam AggregateId Base aggregate id
 */
trait DomainAggregate[AggregateId] extends DomainEntity {

  val aggregateId: AggregateId

}
