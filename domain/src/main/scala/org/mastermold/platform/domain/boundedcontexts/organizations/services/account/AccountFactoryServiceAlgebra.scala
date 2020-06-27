package org.mastermold.platform.domain.boundedcontexts.organizations.services.account

import org.mastermold.platform.domain.definitions.{ DomainEntity, DomainEntityFactoryServiceEffectfulAlgebra }

trait AccountFactoryServiceAlgebra[F[_], Repr, Aggregate <: DomainEntity]
    extends DomainEntityFactoryServiceEffectfulAlgebra[F, Repr, Aggregate]
