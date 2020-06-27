package org.mastermold.platform.domain.boundedcontexts.organizations.repositories.team

import org.mastermold.platform.domain.definitions.{ CheckedInvariant, DomainAggregate, DomainValue }

/**
 * Team repository algebra.
 *
 * @author Nick Odumo (nodumowebdev@gmail.com)
 * @tparam F       Effect
 * @tparam  TeamId TeamId to persist
 * @tparam  Team   Team to persist
 */
trait TeamRepositoryAlgebra[F[_], TeamId <: DomainValue, Team[_] <: DomainAggregate[TeamId]] {

  type TeamAggregate = Team[TeamId]

  def createNewTeam(team: CheckedInvariant[TeamAggregate]): F[TeamAggregate]

  def retrieveTeamById(teamId: CheckedInvariant[TeamId]): F[Option[TeamAggregate]]

  def updateExistingTeam(team: CheckedInvariant[TeamAggregate]): F[Option[TeamAggregate]]

  def deleteTeamById(teamId: CheckedInvariant[TeamId]): F[Unit]

}
