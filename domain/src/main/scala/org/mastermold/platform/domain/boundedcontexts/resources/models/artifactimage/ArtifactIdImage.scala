package org.mastermold.platform.domain.boundedcontexts.resources.models.artifactimage

import org.mastermold.platform.domain.definitions.DomainValue

final case class ArtifactIdImage(value: ArtifactIdImage.Repr) extends DomainValue

object ArtifactIdImage {

  type Repr = String

}