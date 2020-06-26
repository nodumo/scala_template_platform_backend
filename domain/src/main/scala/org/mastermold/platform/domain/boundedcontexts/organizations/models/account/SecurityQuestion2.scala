package org.mastermold.platform.domain.boundedcontexts.organizations.models.account

import org.mastermold.platform.domain.definitions.DomainValue

final case class SecurityQuestion2 private[domain] (value: SecurityQuestion2.Repr) extends DomainValue

object SecurityQuestion2 {

  type Repr = String

}