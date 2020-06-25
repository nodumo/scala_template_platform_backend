package org.mastermold.platform.domain.boundedcontexts.organizations.models.team

import org.mastermold.platform.domain.definitions.DomainValue

final case class Name(value: Name.Repr) extends DomainValue

object Name {

  type Repr = String

}