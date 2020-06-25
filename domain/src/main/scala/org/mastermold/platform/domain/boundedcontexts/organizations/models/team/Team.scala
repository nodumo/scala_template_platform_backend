package org.mastermold.platform.domain.boundedcontexts.organizations.models.team

import org.mastermold.platform.domain.definitions.DomainAggregate

final case class Team(aggregateId: TeamId) extends DomainAggregate[TeamId]

object Team {

  type Repr = String

}