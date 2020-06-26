package org.mastermold.platform.domain.boundedcontexts.organizations.repositories.team

import org.mastermold.platform.domain.definitions.{ DomainAggregate, DomainValue }

/**
 * Team repository algebra.
 *
 * @author Nick Odumo (nodumowebdev@gmail.com)
 * @tparam F       Effect
 * @tparam  TeamId TeamId to persist
 * @tparam  Team   Team id to persist
 */
trait TeamRepositoryAlgebra[F[_], TeamId <: DomainValue, Team[_] <: DomainAggregate[TeamId]] {

  type TeamAggregate = Team[TeamId]

  def createNewTeam(team: TeamAggregate): F[TeamAggregate]

  def retrieveTeamById(teamId: TeamId): F[Option[TeamAggregate]]

  def updateExistingTeam(team: TeamAggregate): F[Option[TeamAggregate]]

  def deleteTeamById(teamId: TeamId): F[Unit]

}
