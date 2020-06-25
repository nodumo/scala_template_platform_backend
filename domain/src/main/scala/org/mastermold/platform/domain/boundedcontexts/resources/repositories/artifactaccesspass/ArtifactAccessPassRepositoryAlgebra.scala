package org.mastermold.platform.domain.boundedcontexts.resources.repositories.artifactaccesspass

import org.mastermold.platform.domain.definitions.{
  DomainAggregate,
  DomainValue
}

/**
  * ArtifactAccessPass repository algebra.
  *
  * @author Nick Odumo (nodumowebdev@gmail.com)
  * @tparam F                     Effect 
  * @tparam  ArtifactAccessPassId ArtifactAccessPassId to persist  
  * @tparam  ArtifactAccessPass   ArtifactAccessPass id to persist 
  */
trait ArtifactAccessPassRepositoryAlgebra[F[_], ArtifactAccessPassId <: DomainValue, ArtifactAccessPass[_] <: DomainAggregate[ArtifactAccessPassId]] {

  def createNewArtifactAccessPass(artifactAccessPass: ArtifactAccessPass): F[ArtifactAccessPass]

  def retrieveArtifactAccessPassById(artifactAccessPassId: ArtifactAccessPass): F[Option[ArtifactAccessPass]]

  def updateExistingArtifactAccessPass(artifactAccessPass: ArtifactAccessPass): F[Option[ArtifactAccessPass]]

  def deleteArtifactAccessPassById(artifactAccessPassId: ArtifactAccessPassId): F[Unit]

}
 