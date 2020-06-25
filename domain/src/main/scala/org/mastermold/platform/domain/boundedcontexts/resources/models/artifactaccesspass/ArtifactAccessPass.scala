package org.mastermold.platform.domain.boundedcontexts.resources.models.artifactaccesspass

import org.mastermold.platform.domain.definitions.DomainValue

final case class ArtifactAccessPass(value: ArtifactAccessPass.Repr) extends DomainValue

object ArtifactAccessPass {

  type Repr = String

}