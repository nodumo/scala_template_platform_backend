package org.mastermold.platform.domain.boundedcontexts.organizations.models.person

import org.mastermold.platform.domain.definitions.DomainValue

final case class DateOfBirth private[domain] (value: DateOfBirth.Repr) extends DomainValue

object DateOfBirth {

  type Repr = String

}