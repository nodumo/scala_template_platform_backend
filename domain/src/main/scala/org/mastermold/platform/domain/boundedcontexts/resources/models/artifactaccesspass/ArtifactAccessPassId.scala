package org.mastermold.platform.domain.boundedcontexts.resources.models.artifactaccesspass

import org.mastermold.platform.domain.definitions.DomainValue

final case class ArtifactAccessPassId private[domain] (value: ArtifactAccessPassId.Repr) extends DomainValue

object ArtifactAccessPassId {

  type Repr = String

}
