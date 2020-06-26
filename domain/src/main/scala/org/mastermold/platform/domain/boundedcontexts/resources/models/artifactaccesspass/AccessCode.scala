package org.mastermold.platform.domain.boundedcontexts.resources.models.artifactaccesspass

import org.mastermold.platform.domain.definitions.DomainValue

final case class AccessCode(value: AccessCode.Repr) extends DomainValue

object AccessCode {

  type Repr = String

}