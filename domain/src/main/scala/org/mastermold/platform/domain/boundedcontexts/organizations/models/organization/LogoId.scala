package org.mastermold.platform.domain.boundedcontexts.organizations.models.organization

import java.util.UUID
import org.mastermold.platform.domain.definitions.DomainValue

final case class LogoId private[domain] (value: LogoId.Repr) extends DomainValue

object LogoId {

  type Repr = UUID

}
