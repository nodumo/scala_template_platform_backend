package org.mastermold.platform.domain.boundedcontexts.organizations.models.person

import org.mastermold.platform.domain.definitions.DomainValue

final case class Sex private[domain] (value: Sex.Repr) extends DomainValue

object Sex {

  type Repr = String

}
