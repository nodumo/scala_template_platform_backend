package org.mastermold.platform.domain.boundedcontexts.organizations.models.organization

import org.mastermold.platform.domain.definitions.DomainValue

final case class OrganizationId(value: OrganizationId.Repr) extends DomainValue

object OrganizationId {

  type Repr = String

}