package org.mastermold.platform.domain.boundedcontexts.organizations.models.account


import org.mastermold.platform.domain.definitions.DomainValue

final case class SecurityQuestionAnswer1(value: SecurityQuestionAnswer1.Repr) extends DomainValue

object SecurityQuestionAnswer1 {

  type Repr = String

}