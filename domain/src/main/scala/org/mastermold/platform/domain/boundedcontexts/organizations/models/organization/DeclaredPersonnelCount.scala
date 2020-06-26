package org.mastermold.platform.domain.boundedcontexts.organizations.models.organization

import org.mastermold.platform.domain.definitions.DomainValue

final case class DeclaredPersonnelCount private[domain] (value: DeclaredPersonnelCount.Repr) extends DomainValue

object DeclaredPersonnelCount {

  type Repr = Int

}
