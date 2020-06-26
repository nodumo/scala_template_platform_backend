package org.mastermold.platform.domain.boundedcontexts.organizations.models.account

import org.mastermold.platform.domain.definitions.DomainValue

final case class SecurityQuestion3 private[domain] (value: SecurityQuestion3.Repr) extends DomainValue

object SecurityQuestion3 {

  type Repr = String

}
