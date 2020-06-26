package org.mastermold.platform.domain.boundedcontexts.organizations.models.team

import org.mastermold.platform.domain.boundedcontexts.organizations.models.shared.IsTwoFactorMandatory
import org.mastermold.platform.domain.definitions.DomainAggregate

/**
  * Team aggregate.
  *
  * "In a business setting most work is accomplished by teams of individuals. Because of this,
  * it is important for employees to have the skills necessary to work effectively with others.
  *
  * Organizations use many kinds of teams, some of which are permanent and some of which are temporary.
  *
  * Teams are used to accomplish tasks that are too large or complex to be done by an individual or
  * that require a diverse set of skills and expertise.
  * " - Domain expert
  *
  * @author Nick Odumo (nodumo@nodumo.com)
  * @param aggregateId Aggregate id
  * @param description Description of the Organization
  * @param isTwoFactorMandatory   Is two-factor authentication enabled
  * @param name        Team name
  */
final case class Team private[domain] (aggregateId: TeamId,
                      description: Description,
                      isTwoFactorMandatory: IsTwoFactorMandatory,
                      name: Name) extends DomainAggregate[TeamId]

object Team {}