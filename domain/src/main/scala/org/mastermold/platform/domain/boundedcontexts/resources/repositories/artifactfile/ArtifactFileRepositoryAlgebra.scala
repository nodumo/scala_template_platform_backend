package org.mastermold.platform.domain.boundedcontexts.resources.repositories.artifactfile

import org.mastermold.platform.domain.definitions.{
  DomainAggregate,
  DomainValue
}

/**
  * ArtifactFile repository algebra.
  *
  * @author Nick Odumo (nodumowebdev@gmail.com)
  * @tparam F               Effect 
  * @tparam  ArtifactFileId ArtifactFileId to persist  
  * @tparam  ArtifactFile   ArtifactFile id to persist 
  */
trait ArtifactFileRepositoryAlgebra[F[_], ArtifactFileId <: DomainValue, ArtifactFile[_] <: DomainAggregate[ArtifactFileId]] {

  def createNewArtifactFile(artifactFile: ArtifactFile): F[ArtifactFile]

  def retrieveArtifactFileById(artifactFileId: ArtifactFile): F[Option[ArtifactFile]]

  def updateExistingArtifactFile(artifactFile: ArtifactFile): F[Option[ArtifactFile]]

  def deleteArtifactFileById(artifactFileId: ArtifactFileId): F[Unit]

}
 