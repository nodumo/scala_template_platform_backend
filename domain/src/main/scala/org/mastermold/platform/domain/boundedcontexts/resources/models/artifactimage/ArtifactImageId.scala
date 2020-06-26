package org.mastermold.platform.domain.boundedcontexts.resources.models.artifactimage

import org.mastermold.platform.domain.definitions.DomainValue

final case class ArtifactImageId(value: ArtifactImageId.Repr) extends DomainValue

object ArtifactImageId {

  type Repr = String

}