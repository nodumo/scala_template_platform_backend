package org.mastermold.platform.domain.boundedcontexts.resources.models.asset

import org.mastermold.platform.domain.definitions.DomainValue

final case class Description private[domain] (value: Description.Repr) extends DomainValue

object Description {

  type Repr = String

}