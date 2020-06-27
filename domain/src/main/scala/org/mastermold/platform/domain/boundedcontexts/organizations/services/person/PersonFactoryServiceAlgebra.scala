package org.mastermold.platform.domain.boundedcontexts.organizations.services.person

import org.mastermold.platform.domain.definitions.{ DomainEntity, DomainEntityFactoryServiceEffectfulAlgebra }

trait PersonFactoryServiceAlgebra[F[_], Repr, Aggregate <: DomainEntity]
    extends DomainEntityFactoryServiceEffectfulAlgebra[F, Repr, Aggregate]
