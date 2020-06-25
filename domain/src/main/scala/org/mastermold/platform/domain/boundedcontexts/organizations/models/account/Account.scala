package org.mastermold.platform.domain.boundedcontexts.organizations.models.account

import org.mastermold.platform.domain.definitions.DomainAggregate

/**
  * Account aggregate
  *
  * @author Nick Odumo (nodumo@nodumo.com)
  * @usecase Representing the user's account
  * @param aggregateId             Aggregate id
  * @param credentialEmail         Credential email
  * @param password                Password
  * @param securityQuestion1       Security question 1
  * @param securityQuestion2       Security question 2
  * @param securityQuestion3       Security question 3
  * @param securityQuestionAnswer1 Security question answer 1
  * @param securityQuestionAnswer2 Security question answer 2
  * @param securityQuestionAnswer3 Security question answer 3
  */
final case class Account private(aggregateId: AccountId,
                         credentialEmail: CredentialEmail,
                         credentialUsername: CredentialUsername,
                         password: Password,
                         securityQuestion1: Option[SecurityQuestion1],
                         securityQuestion2: Option[SecurityQuestion2],
                         securityQuestion3: Option[SecurityQuestion3],
                         securityQuestionAnswer1: Option[SecurityQuestionAnswer1],
                         securityQuestionAnswer2: Option[SecurityQuestionAnswer2],
                         securityQuestionAnswer3: Option[SecurityQuestionAnswer3]) extends DomainAggregate[AccountId]


object Account {


}