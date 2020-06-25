package org.mastermold.platform.domain.boundedcontexts.organizations.models.account

import org.mastermold.platform.domain.definitions.DomainValue

final case class KeyPublic(value: KeyPublic.Repr) extends DomainValue

object KeyPublic {

  type Repr = String

}