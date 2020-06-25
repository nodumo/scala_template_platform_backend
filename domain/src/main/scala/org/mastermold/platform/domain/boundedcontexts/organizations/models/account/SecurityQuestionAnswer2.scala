package org.mastermold.platform.domain.boundedcontexts.organizations.models.account

import org.mastermold.platform.domain.definitions.DomainValue

final case class SecurityQuestionAnswer2(value: SecurityQuestionAnswer2.Repr) extends DomainValue

object SecurityQuestionAnswer2 {

  type Repr = String

}