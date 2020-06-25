package org.mastermold.platform.domain.boundedcontexts.organizations.models.shared

import org.mastermold.platform.domain.definitions.DomainValue

/**
  * Two-factor authentication flag, indicates whether or not a given
  * entity needs two factor authentication to login.
  *
  * "Entities need support rules governing whether or not the agent
  *  must login with a secondary confirmation of their identity
  *
  *  - Organizations can specify whether or not to use 2FA
  *  - Teams can specify whether or not to use 2FA
  *  - Accounts can specify whether or not to use 2FA
  *
  *  " - Domain Expert
  *
  * @author Nick Odumo (nodumo@nodumo.com)
  * @param value Value
  */
final case class IsTwoFactorMandatory(value: IsTwoFactorMandatory.Repr) extends DomainValue

object IsTwoFactorMandatory {

  type Repr = Boolean

  private[domain] val IS_ENFORCED: Boolean = true

  private[domain] val IS_NOT_ENFORCED: Boolean = false

}