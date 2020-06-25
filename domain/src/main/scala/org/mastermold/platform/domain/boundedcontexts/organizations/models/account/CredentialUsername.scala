package org.mastermold.platform.domain.boundedcontexts.organizations.models.account


import org.mastermold.platform.domain.definitions.DomainValue

final case class CredentialUsername(value: CredentialUsername.Repr) extends DomainValue

object CredentialUsername {

  type Repr = String

}