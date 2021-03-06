package org.mastermold.platform.domain.boundedcontexts.resources.repositories.asset

import org.mastermold.platform.domain.definitions.{ CheckedInvariant, DomainAggregate, DomainValue }

/**
 * Asset repository algebra.
 *
 * @author Grumpy Cat (nodumowebdev@gmail.com)
 * @tparam F        Effect
 * @tparam  AssetId AssetId to persist
 * @tparam  Asset   Asset to persist
 */
trait AssetRepositoryAlgebra[F[_], AssetId <: DomainValue, Asset[_] <: DomainAggregate[AssetId]] {

  type AssetAggregate = Asset[AssetId]

  def createNewAsset(asset: CheckedInvariant[AssetAggregate]): F[AssetAggregate]

  def retrieveAssetById(assetId: AssetId): F[Option[AssetAggregate]]

  def updateExistingAsset(asset: CheckedInvariant[AssetAggregate]): F[Option[AssetAggregate]]

  def deleteAssetById(assetId: AssetId): F[Unit]

}
