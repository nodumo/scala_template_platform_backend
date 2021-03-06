package org.mastermold.platform.domain.boundedcontexts.organizations.models.organization

import org.mastermold.platform.domain.boundedcontexts.organizations.models.shared.IsTwoFactorMandatory
import org.mastermold.platform.domain.definitions.DomainAggregate

/**
 * Organization aggregate
 *
 * "An organization or organisation is an entity, such as a company, an institution, or an association,
 * comprising one or more people and having a particular purpose." - Domain expert
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @param aggregateId            Aggregate id
 * @param declaredPersonnelCount Declared head-count for
 * @param description            Description of the Organization
 * @param isTwoFactorMandatory   Is two-factor authentication enabled
 * @param socialFacebokGroup     Facebook group id
 * @param socialFacebookPage     Facebook pages id
 * @param socialTwitterHandle    Twitter handle
 */
final case class Organization private[domain] (aggregateId: OrganizationId,
                                               declaredPersonnelCount: DeclaredPersonnelCount,
                                               description: Description,
                                               isTwoFactorMandatory: IsTwoFactorMandatory,
                                               logoId: LogoId,
                                               socialFacebokGroup: Option[SocialFacebokGroup],
                                               socialFacebookPage: Option[SocialFacebookPage],
                                               socialTwitterHandle: Option[SocialTwitterHandle])
    extends DomainAggregate[OrganizationId]

object Organization {}
