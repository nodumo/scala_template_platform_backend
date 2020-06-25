package org.mastermold.platform.domain.boundedcontexts.organizations.models.account


import org.mastermold.platform.domain.definitions.DomainValue

final case class CredentialEmail(value: CredentialEmail.Repr) extends DomainValue

object CredentialEmail {

  type Repr = String

}