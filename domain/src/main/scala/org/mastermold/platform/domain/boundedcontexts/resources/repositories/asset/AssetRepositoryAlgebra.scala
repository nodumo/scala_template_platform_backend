package org.mastermold.platform.domain.boundedcontexts.resources.repositories.asset

import org.mastermold.platform.domain.definitions.{ DomainAggregate, DomainValue }

/**
 * Asset repository algebra.
 *
 * @author Nick Odumo (nodumowebdev@gmail.com)
 * @tparam F        Effect
 * @tparam  AssetId AssetId to persist
 * @tparam  Asset   Asset to persist
 */
trait AssetRepositoryAlgebra[F[_], AssetId <: DomainValue, Asset[_] <: DomainAggregate[AssetId]] {

  type AssetAggregate = Asset[AssetId]

  def createNewAsset(asset: AssetAggregate): F[AssetAggregate]

  def retrieveAssetById(assetId: AssetId): F[Option[AssetAggregate]]

  def updateExistingAsset(asset: AssetAggregate): F[Option[AssetAggregate]]

  def deleteAssetById(assetId: AssetId): F[Unit]

}
