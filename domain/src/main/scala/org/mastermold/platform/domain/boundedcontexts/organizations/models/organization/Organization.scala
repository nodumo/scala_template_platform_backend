package org.mastermold.platform.domain.boundedcontexts.organizations.models.organization

import org.mastermold.platform.domain.definitions.DomainAggregate

final case class Organization(aggregateId: OrganizationId) extends DomainAggregate[OrganizationId]

object Organization {

  type Repr = String

}