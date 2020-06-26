package org.mastermold.platform.domain.boundedcontexts.resources.models.asset

import monocle.Lens
import monocle.macros.GenLens
import org.mastermold.platform.domain.definitions.DomainAggregate

/**
 * Asset aggregate
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param aggregateId Aggregate id
 * @param description Description
 * @param name        Name
 */
final case class Asset private[domain] (aggregateId: AssetId, description: Description, name: Name)
    extends DomainAggregate[AssetId]

object Asset {

  // Lenses: Mutable fields

  val aggregateIdLens: Lens[Asset, AssetId]     = GenLens[Asset](_.aggregateId)
  val descriptionLens: Lens[Asset, Description] = GenLens[Asset](_.description)
  val nameLens: Lens[Asset, Name]               = GenLens[Asset](_.name)

}
