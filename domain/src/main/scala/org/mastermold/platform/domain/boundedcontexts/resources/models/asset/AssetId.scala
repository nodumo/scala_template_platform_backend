package org.mastermold.platform.domain.boundedcontexts.resources.models.asset

import org.mastermold.platform.domain.definitions.DomainValue

final case class AssetId private[domain] (value: AssetId.Repr) extends DomainValue

object AssetId {

  type Repr = String

}
