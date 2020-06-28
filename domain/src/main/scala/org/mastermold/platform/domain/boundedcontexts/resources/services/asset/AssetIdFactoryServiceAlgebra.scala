package org.mastermold.platform.domain.boundedcontexts.resources.services.asset

import org.mastermold.platform.domain.definitions.{ DomainEntity, DomainEntityFactoryServiceEffectfulAlgebra }

trait AssetIdFactoryServiceAlgebra[F[_], Repr, Value <: DomainEntity]
    extends DomainEntityFactoryServiceEffectfulAlgebra[F, Repr, Value]
