package org.mastermold.platform.domain.boundedcontexts.resources.repositories.artifactimage

import org.mastermold.platform.domain.definitions.{
  DomainAggregate,
  DomainValue
}

/**
  * ArtifactImage repository algebra.
  *
  * @author Nick Odumo (nodumowebdev@gmail.com)
  * @tparam F                Effect 
  * @tparam  ArtifactImageId ArtifactImageId to persist  
  * @tparam  ArtifactImage   ArtifactImage id to persist 
  */
trait ArtifactImageRepositoryAlgebra[F[_], ArtifactImageId <: DomainValue, ArtifactImage[_] <: DomainAggregate[ArtifactImageId]] {

  def createNewArtifactImage(artifactImage: ArtifactImage): F[ArtifactImage]

  def retrieveArtifactImageById(artifactImageId: ArtifactImage): F[Option[ArtifactImage]]

  def updateExistingArtifactImage(artifactImage: ArtifactImage): F[Option[ArtifactImage]]

  def deleteArtifactImageById(artifactImageId: ArtifactImageId): F[Unit]

}
 