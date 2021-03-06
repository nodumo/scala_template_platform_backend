package org.mastermold.platform.domain.boundedcontexts.organizations.models.person

import org.mastermold.platform.domain.definitions.DomainValue

final case class NameFirst private[domain] (value: NameFirst.Repr) extends DomainValue

object NameFirst {

  type Repr = String

}
