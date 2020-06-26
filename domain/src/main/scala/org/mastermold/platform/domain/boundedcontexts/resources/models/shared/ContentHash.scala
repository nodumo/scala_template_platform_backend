package org.mastermold.platform.domain.boundedcontexts.resources.models.shared

import org.mastermold.platform.domain.definitions.DomainValue

final case class ContentHash private[domain] (value: ContentHash.Repr) extends DomainValue

object ContentHash {

  type Repr = String

}