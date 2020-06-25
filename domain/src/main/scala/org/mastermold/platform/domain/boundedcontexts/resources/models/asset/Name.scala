package org.mastermold.platform.domain.boundedcontexts.resources.models.asset

import org.mastermold.platform.domain.definitions.DomainValue

final case class Name(value: Name.Repr) extends DomainValue

object Name {

  type Repr = String

}