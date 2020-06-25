package org.mastermold.platform.domain.boundedcontexts.organizations.models.account

import org.mastermold.platform.domain.definitions.DomainValue

final case class KeyPrivate(value: KeyPrivate.Repr) extends DomainValue

object KeyPrivate {

  type Repr = String

}