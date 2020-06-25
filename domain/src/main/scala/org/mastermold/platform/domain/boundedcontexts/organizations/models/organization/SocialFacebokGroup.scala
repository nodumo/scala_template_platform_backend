package org.mastermold.platform.domain.boundedcontexts.organizations.models.organization


import org.mastermold.platform.domain.definitions.DomainValue

final case class SocialFacebokGroup(value: SocialFacebokGroup.Repr) extends DomainValue

object SocialFacebokGroup {

  type Repr = String

}