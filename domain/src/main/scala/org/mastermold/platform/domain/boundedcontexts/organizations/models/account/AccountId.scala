package org.mastermold.platform.domain.boundedcontexts.organizations.models.account

import java.util.UUID
import org.mastermold.platform.domain.definitions.DomainValue

final case class AccountId(value: AccountId.Repr) extends DomainValue

object AccountId {

  type Repr = UUID

}