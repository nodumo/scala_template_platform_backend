package org.mastermold.platform.domain.boundedcontexts.organizations.models.organization

import org.mastermold.platform.domain.definitions.DomainValue

final case class SocialTwitterHandle private[domain] (value: SocialTwitterHandle.Repr) extends DomainValue

object SocialTwitterHandle {

  type Repr = String

}
