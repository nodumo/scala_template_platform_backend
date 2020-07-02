package org.mastermold.platform.domain.boundedcontexts.resources.models.artifactfile

import monocle.Lens
import monocle.macros.GenLens
import org.mastermold.platform.domain.boundedcontexts.resources.models.shared.{ ContentHash, FileType }
import org.mastermold.platform.domain.definitions.DomainAggregate

/**
 * ArtifactFile aggregate
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @param aggregateId Aggregate id
 * @param contentHash Content hash
 */
final case class ArtifactFile private[domain] (aggregateId: ArtifactFileId,
                                               contentHash: ContentHash,
                                               fileType: FileType)
    extends DomainAggregate[ArtifactFileId]

object ArtifactFile {

  // Lenses: Mutable field

  private[domain] val contentHashLens: Lens[ArtifactFile, ContentHash] = GenLens[ArtifactFile](_.contentHash)
  private[domain] val fileTypeLens: Lens[ArtifactFile, FileType]       = GenLens[ArtifactFile](_.fileType)

}
