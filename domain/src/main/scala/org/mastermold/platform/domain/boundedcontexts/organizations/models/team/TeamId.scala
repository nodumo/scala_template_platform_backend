package org.mastermold.platform.domain.boundedcontexts.organizations.models.team

import org.mastermold.platform.domain.definitions.DomainValue

final case class TeamId private[domain] (value: TeamId.Repr) extends DomainValue

object TeamId {

  type Repr = String

}
