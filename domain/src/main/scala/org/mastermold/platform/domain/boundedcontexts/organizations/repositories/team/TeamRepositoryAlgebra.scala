package org.mastermold.platform.domain.boundedcontexts.organizations.repositories.team

import org.mastermold.platform.domain.definitions.{
  DomainAggregate,
  DomainValue
}

/**
  * TeamId repository algebra.
  *
  * @author Nick Odumo (nodumowebdev@gmail.com)
  * @tparam F       Effect 
  * @tparam  TeamId TeamId to persist  
  * @tparam  Team   Team id to persist 
  */
trait TeamRepositoryAlgebra[F[_], TeamId <: DomainValue, Team[_] <: DomainAggregate[TeamId]] {

  def createNewTeam(team: Team): F[Team]

  def retrieveTeamById(teamId: Team): F[Option[Team]]

  def updateExistingTeam(team: Team): F[Option[Team]]

  def deleteTeamById(teamId: TeamId): F[Unit]

}
 