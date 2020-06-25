package org.mastermold.platform.domain.boundedcontexts.organizations.repositories.organization

import org.mastermold.platform.domain.definitions.{
  DomainAggregate,
  DomainValue
}

/**
  * OrganizationId repository algebra.
  *
  * @author Nick Odumo (nodumowebdev@gmail.com)
  * @tparam F               Effect 
  * @tparam  OrganizationId OrganizationId to persist  
  * @tparam  Organization   Organization id to persist 
  */
trait OrganizationRepositoryAlgebra[F[_], OrganizationId <: DomainValue, Organization[_] <: DomainAggregate[OrganizationId]] {

  def createNewOrganization(organization: Organization): F[Organization]

  def retrieveOrganizationById(organizationId: Organization): F[Option[Organization]]

  def updateExistingOrganization(organization: Organization): F[Option[Organization]]

  def deleteOrganizationById(organizationId: OrganizationId): F[Unit]

}
 