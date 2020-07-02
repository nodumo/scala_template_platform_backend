package org.mastermold.platform.domain.boundedcontexts.organizations.models.account

import monocle.Lens
import monocle.macros.GenLens
import org.mastermold.platform.domain.boundedcontexts.organizations.models.shared.IsTwoFactorMandatory
import org.mastermold.platform.domain.definitions.DomainAggregate

/**
 * Account aggregate
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @usecase Representing the user's authorized account
 * @param aggregateId             Aggregate id
 * @param credentialEmail         Credential email
 * @param isTwoFactorMandatory    Is two-factor authentication enabled
 * @param password                Password
 * @param securityQuestion1       Security question 1
 * @param securityQuestion2       Security question 2
 * @param securityQuestion3       Security question 3
 * @param securityQuestionAnswer1 Security question answer 1
 * @param securityQuestionAnswer2 Security question answer 2
 * @param securityQuestionAnswer3 Security question answer 3
 */
final case class Account private[domain] (aggregateId: AccountId,
                                          // Allow the possibility of different authentication bearers
                                          credentialEmail: CredentialEmail,
                                          credentialUsername: CredentialUsername,
                                          // Encrypted password
                                          password: Password,
                                          // Authentication rules
                                          isTwoFactorMandatory: IsTwoFactorMandatory,
                                          // Security credentials
                                          securityQuestion1: Option[SecurityQuestion1],
                                          securityQuestion2: Option[SecurityQuestion2],
                                          securityQuestion3: Option[SecurityQuestion3],
                                          securityQuestionAnswer1: Option[SecurityQuestionAnswer1],
                                          securityQuestionAnswer2: Option[SecurityQuestionAnswer2],
                                          securityQuestionAnswer3: Option[SecurityQuestionAnswer3])
    extends DomainAggregate[AccountId]

object Account {

  // Lenses: Mutable fields

  private[domain] val credentialEmailLens: Lens[Account, CredentialEmail]       = GenLens[Account](_.credentialEmail)
  private[domain] val credentialUsernameLens: Lens[Account, CredentialUsername] = GenLens[Account](_.credentialUsername)
  private[domain] val credentialPasswordLens: Lens[Account, Password]           = GenLens[Account](_.password)
  /*
  private[domain] val securityQuestion1Lens: Lens[Account, SecurityQuestion1] = GenLens[Account](_.securityQuestion1)
  private[domain] val securityQuestion2Lens: Lens[Account, SecurityQuestion2] = GenLens[Account](_.securityQuestion2)
  private[domain] val securityQuestion3Lens: Lens[Account, SecurityQuestion3] = GenLens[Account](_.securityQuestion3)

  private[domain] val securityQuestionAnswer1Lens: Lens[Account, SecurityQuestionAnswer1] =
    GenLens[Account](_.securityQuestionAnswer1)
  private[domain] val securityQuestionAnswer2Lens: Lens[Account, SecurityQuestionAnswer2] =
    GenLens[Account](_.securityQuestionAnswer2)
  private[domain] val securityQuestionAnswer3Lens: Lens[Account, SecurityQuestionAnswer3] =
    GenLens[Account](_.securityQuestionAnswer3)

 */
}
