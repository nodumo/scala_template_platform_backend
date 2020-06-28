package org.mastermold.platform.domain.boundedcontexts.resources.repositories.artifactimage

import org.mastermold.platform.domain.definitions.{ CheckedInvariant, DomainAggregate, DomainValue }

/**
 * ArtifactImage repository algebra.
 *
 * @author Nick Odumo (nodumowebdev@gmail.com)
 * @tparam F                Effect
 * @tparam  ArtifactImageId ArtifactImageId to persist
 * @tparam  ArtifactImage   ArtifactImage to persist
 */
trait ArtifactImageRepositoryAlgebra[
    F[_], ArtifactImageId <: DomainValue, ArtifactImage[_] <: DomainAggregate[ArtifactImageId]] {

  type ArtifactImageAggregate = ArtifactImage[ArtifactImageId]

  def createNewArtifactImage(artifactImage: CheckedInvariant[ArtifactImageAggregate]): F[ArtifactImageAggregate]

  def retrieveArtifactImageById(artifactImageId: ArtifactImageId): F[Option[ArtifactImageAggregate]]

  def updateExistingArtifactImage(
      artifactImage: CheckedInvariant[ArtifactImageAggregate]): F[Option[ArtifactImageAggregate]]

  def deleteArtifactImageById(artifactImageId: ArtifactImageAggregate): F[Unit]

}
