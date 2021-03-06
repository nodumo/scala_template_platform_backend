package org.mastermold.platform.domain.boundedcontexts.organizations.models.person

import org.mastermold.platform.domain.definitions.DomainAggregate

final case class Person private[domain] (aggregateId: PersonId) extends DomainAggregate[PersonId]
