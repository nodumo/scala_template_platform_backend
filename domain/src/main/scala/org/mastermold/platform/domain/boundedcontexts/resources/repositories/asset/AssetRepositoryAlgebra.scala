package org.mastermold.platform.domain.boundedcontexts.resources.repositories.asset

import org.mastermold.platform.domain.definitions.{
  DomainAggregate,
  DomainValue
}

/**
  * Asset repository algebra.
  *
  * @author Nick Odumo (nodumowebdev@gmail.com)
  * @tparam F        Effect 
  * @tparam  AssetId AssetId to persist  
  * @tparam  Asset   Asset id to persist 
  */
trait AssetRepositoryAlgebra[F[_], AssetId <: DomainValue, Asset[_] <: DomainAggregate[AssetId]] {

  def createNewAsset(asset: Asset): F[Asset]

  def retrieveAssetById(assetId: Asset): F[Option[Asset]]

  def updateExistingAsset(asset: Asset): F[Option[Asset]]

  def deleteAssetById(assetId: AssetId): F[Unit]

}
 