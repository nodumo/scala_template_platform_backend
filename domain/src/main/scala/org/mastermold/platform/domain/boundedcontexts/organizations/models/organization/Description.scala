package org.mastermold.platform.domain.boundedcontexts.organizations.models.organization


import org.mastermold.platform.domain.definitions.DomainValue

final case class Description(value: Description.Repr) extends DomainValue

object Description {

  type Repr = String

}