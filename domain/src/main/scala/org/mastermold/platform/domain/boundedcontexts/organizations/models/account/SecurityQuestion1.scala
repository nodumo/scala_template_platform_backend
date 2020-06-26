package org.mastermold.platform.domain.boundedcontexts.organizations.models.account

import org.mastermold.platform.domain.definitions.DomainValue

final case class SecurityQuestion1 private[domain] (value: SecurityQuestion1.Repr) extends DomainValue

object SecurityQuestion1 {

  type Repr = String

}