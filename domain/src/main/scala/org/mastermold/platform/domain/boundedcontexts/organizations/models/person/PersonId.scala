package org.mastermold.platform.domain.boundedcontexts.organizations.models.person

import java.util.UUID
import org.mastermold.platform.domain.definitions.DomainValue

final case class PersonId private[domain] (value: PersonId.Repr) extends DomainValue

object PersonId {

  type Repr = UUID

}
