package org.mastermold.platform.domain.boundedcontexts.organizations.models.organization

import org.mastermold.platform.domain.definitions.DomainAggregate


/**
  * Organization aggregate
  *
  * "An organization or organisation is an entity, such as a company, an institution, or an association,
  * comprising one or more people and having a particular purpose." - Domain expert
  *
  * @author Nick Odumo (nodumo@nodumo.com)
  * @param aggregateId            Aggregate id
  * @param declaredPersonnelCount Declared head-count for
  * @param description            Description of the Organization
  * @param socialFacebokGroup     Facebook group id
  * @param socialFacebookPage     Facebook pages id
  * @param socialTwitterHandle    Twitter handle
  */
final case class Organization(
                               aggregateId: OrganizationId,
                               declaredPersonnelCount: DeclaredPersonnelCount,
                               description: Description,
                               logoId: LogoId,
                               socialFacebokGroup: Option[SocialFacebokGroup],
                               socialFacebookPage: Option[SocialFacebookPage],
                               socialTwitterHandle: Option[SocialTwitterHandle]) extends DomainAggregate[OrganizationId]

object Organization {


}