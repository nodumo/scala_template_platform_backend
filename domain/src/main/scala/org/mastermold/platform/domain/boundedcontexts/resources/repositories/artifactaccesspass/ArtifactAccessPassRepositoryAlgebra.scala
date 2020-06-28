package org.mastermold.platform.domain.boundedcontexts.resources.repositories.artifactaccesspass

import org.mastermold.platform.domain.definitions.{ CheckedInvariant, DomainAggregate, DomainValue }

/**
 * ArtifactAccessPass repository algebra.
 *
 * @author Nick Odumo (nodumowebdev@gmail.com)
 * @tparam F                    Effect
 * @tparam ArtifactAccessPassId ArtifactAccessPassId to persist
 * @tparam ArtifactAccessPass   ArtifactAccessPass to persist
 */
trait ArtifactAccessPassRepositoryAlgebra[
    F[_], ArtifactAccessPassId <: DomainValue, ArtifactAccessPass[_] <: DomainAggregate[ArtifactAccessPassId]] {

  type ArtifactAccessPassAggregate = ArtifactAccessPass[ArtifactAccessPassId]

  def createNewArtifactAccessPass(
      artifactAccessPass: CheckedInvariant[ArtifactAccessPassAggregate]): F[ArtifactAccessPassAggregate]

  def retrieveArtifactAccessPassById(
      artifactAccessPassId: ArtifactAccessPassId): F[Option[ArtifactAccessPassAggregate]]

  def updateExistingArtifactAccessPass(
      artifactAccessPass: CheckedInvariant[ArtifactAccessPassAggregate]): F[Option[ArtifactAccessPassAggregate]]

  def deleteArtifactAccessPassById(artifactAccessPassId: ArtifactAccessPassId): F[Unit]

}
