package org.mastermold.platform.domain.boundedcontexts.resources.models.asset

import org.mastermold.platform.domain.definitions.DomainAggregate

/**
  * Asset aggregate
  *
  * @author Nick Odumo (nodumo@nodumo.com)
  * @param aggregateId Aggregate id
  * @param description Description
  * @param name        Name
  */
final case class Asset(aggregateId: AssetId,
                       description: Description,
                       name: Name) extends DomainAggregate[AssetId]

object Asset {


}