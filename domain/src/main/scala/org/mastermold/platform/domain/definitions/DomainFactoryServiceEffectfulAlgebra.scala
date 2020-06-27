package org.mastermold.platform.domain.definitions

import org.mastermold.platform.common.softwarepatterns.FactoryServiceEffectfulAlgebra

trait DomainFactoryServiceEffectfulAlgebra[F[_], Repr, Value <: DomainEntity]
    extends FactoryServiceEffectfulAlgebra[F, Repr, Invariant[Value]]
