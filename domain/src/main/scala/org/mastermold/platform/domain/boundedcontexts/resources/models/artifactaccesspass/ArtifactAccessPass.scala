package org.mastermold.platform.domain.boundedcontexts.resources.models.artifactaccesspass

import org.mastermold.platform.domain.definitions.DomainAggregate

final case class ArtifactAccessPass private[domain] (aggregateId: ArtifactAccessPassId)
    extends DomainAggregate[ArtifactAccessPassId]

object ArtifactAccessPass {}
