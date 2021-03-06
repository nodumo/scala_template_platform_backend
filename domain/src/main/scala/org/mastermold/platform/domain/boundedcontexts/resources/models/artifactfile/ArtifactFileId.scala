package org.mastermold.platform.domain.boundedcontexts.resources.models.artifactfile

import org.mastermold.platform.domain.definitions.DomainValue

final case class ArtifactFileId private[domain] (value: ArtifactFileId.Repr) extends DomainValue

object ArtifactFileId {

  type Repr = String

}
