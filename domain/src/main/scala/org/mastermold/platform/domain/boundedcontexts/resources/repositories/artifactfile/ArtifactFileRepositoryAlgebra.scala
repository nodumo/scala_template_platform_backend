package org.mastermold.platform.domain.boundedcontexts.resources.repositories.artifactfile

import org.mastermold.platform.domain.definitions.{ DomainAggregate, DomainValue }

/**
 * ArtifactFile repository algebra.
 *
 * @author Nick Odumo (nodumowebdev@gmail.com)
 * @tparam F               Effect
 * @tparam  ArtifactFileId ArtifactFileId to persist
 * @tparam  ArtifactFile   ArtifactFile to persist
 */
trait ArtifactFileRepositoryAlgebra[
    F[_], ArtifactFileId <: DomainValue, ArtifactFile[_] <: DomainAggregate[ArtifactFileId]] {

  type ArtifactFileAggregate = ArtifactFile[ArtifactFileId]

  def createNewArtifactFile(artifactFile: ArtifactFileAggregate): F[ArtifactFileAggregate]

  def retrieveArtifactFileById(artifactFileId: ArtifactFileId): F[Option[ArtifactFileAggregate]]

  def updateExistingArtifactFile(artifactFile: ArtifactFileAggregate): F[Option[ArtifactFileAggregate]]

  def deleteArtifactFileById(artifactFileId: ArtifactFileId): F[Unit]

}
