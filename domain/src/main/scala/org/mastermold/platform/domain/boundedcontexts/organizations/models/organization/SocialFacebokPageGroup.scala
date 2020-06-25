package org.mastermold.platform.domain.boundedcontexts.organizations.models.organization


import org.mastermold.platform.domain.definitions.DomainValue

final case class SocialFacebokPageGroup(value: SocialFacebokPageGroup.Repr) extends DomainValue

object SocialFacebokPageGroup {

  type Repr = String

}