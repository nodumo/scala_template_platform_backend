package org.mastermold.platform.domain.boundedcontexts.organizations.repositories.organization

import org.mastermold.platform.domain.definitions.{ CheckedInvariant, DomainAggregate, DomainValue }

/**
 * Organization repository algebra.
 *
 * @author Grumpy Cat (nodumowebdev@gmail.com)
 * @tparam F               Effect
 * @tparam  OrganizationId OrganizationId to persist
 * @tparam  Organization   Organization to persist
 */
trait OrganizationRepositoryAlgebra[
    F[_], OrganizationId <: DomainValue, Organization[_] <: DomainAggregate[OrganizationId]] {

  type OrganizationAggregate = Organization[OrganizationId]

  def createNewOrganization(organization: CheckedInvariant[OrganizationAggregate]): F[OrganizationAggregate]

  def retrieveOrganizationById(organizationId: CheckedInvariant[OrganizationId]): F[Option[OrganizationAggregate]]

  def updateExistingOrganization(
      organization: CheckedInvariant[OrganizationAggregate]): F[Option[OrganizationAggregate]]

  def deleteOrganizationById(organizationId: CheckedInvariant[OrganizationId]): F[Unit]

}
