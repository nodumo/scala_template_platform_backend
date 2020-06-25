package org.mastermold.platform.domain.boundedcontexts.organizations.models.account

import org.mastermold.platform.domain.definitions.DomainAggregate

final case class Account(aggregateId: AccountId) extends DomainAggregate[AccountId]