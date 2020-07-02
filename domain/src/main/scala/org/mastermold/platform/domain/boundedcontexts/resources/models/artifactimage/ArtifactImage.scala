package org.mastermold.platform.domain.boundedcontexts.resources.models.artifactimage

import monocle.Lens
import monocle.macros.GenLens
import org.mastermold.platform.domain.boundedcontexts.resources.models.shared.{ ContentHash, FileType }
import org.mastermold.platform.domain.definitions.DomainAggregate

/**
 * ArtifactImage aggregate
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @param aggregateId Aggregate id
 * @param contentHash Content hash
 * @param fileType    File type
 */
final case class ArtifactImage private[domain] (aggregateId: ArtifactImageId,
                                                contentHash: ContentHash,
                                                fileType: FileType)
    extends DomainAggregate[ArtifactImageId]

object ArtifactImage {

  // Lenses: Mutable fields

  private[domain] val contentHashLens: Lens[ArtifactImage, ContentHash] = GenLens[ArtifactImage](_.contentHash)
  private[domain] val fileTypeLens: Lens[ArtifactImage, FileType]       = GenLens[ArtifactImage](_.fileType)

}
