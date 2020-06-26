package org.mastermold.platform.domain.boundedcontexts.organizations.models.person

import org.mastermold.platform.domain.definitions.DomainValue

final case class NameLast private[domain] (value: NameLast.Repr) extends DomainValue

object NameLast {

  type Repr = String

}