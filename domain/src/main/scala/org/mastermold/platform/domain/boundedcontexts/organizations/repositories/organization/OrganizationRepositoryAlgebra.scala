package org.mastermold.platform.domain.boundedcontexts.organizations.repositories.organization

import org.mastermold.platform.domain.definitions.{ DomainAggregate, DomainValue }

/**
 * Organization repository algebra.
 *
 * @author Nick Odumo (nodumowebdev@gmail.com)
 * @tparam F               Effect
 * @tparam  OrganizationId OrganizationId to persist
 * @tparam  Organization   Organization id to persist
 */
trait OrganizationRepositoryAlgebra[
    F[_], OrganizationId <: DomainValue, Organization[_] <: DomainAggregate[OrganizationId]] {

  type OrganizationAggregate = Organization[OrganizationId]

  def createNewOrganization(organization: OrganizationAggregate): F[OrganizationAggregate]

  def retrieveOrganizationById(organizationId: OrganizationId): F[Option[OrganizationAggregate]]

  def updateExistingOrganization(organization: OrganizationAggregate): F[Option[OrganizationAggregate]]

  def deleteOrganizationById(organizationId: OrganizationId): F[Unit]

}
