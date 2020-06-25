package org.mastermold.platform.domain.boundedcontexts.organizations.models.organization

import org.mastermold.platform.domain.definitions.DomainValue

final case class LogoId(value: LogoId.Repr) extends DomainValue

object LogoId {

  type Repr = String

}