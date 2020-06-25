package org.mastermold.platform.domain.boundedcontexts.organizations.models.account


import org.mastermold.platform.domain.definitions.DomainValue

final case class Password(value: Password.Repr) extends DomainValue

object Password {

  type Repr = String

}