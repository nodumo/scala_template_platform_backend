package org.mastermold.platform.domain.boundedcontexts.organizations.models.organization

import org.mastermold.platform.domain.definitions.DomainValue

final case class SocialFacebookPage private[domain] (value: SocialFacebookPage.Repr) extends DomainValue

object SocialFacebookPage {

  type Repr = String

}
