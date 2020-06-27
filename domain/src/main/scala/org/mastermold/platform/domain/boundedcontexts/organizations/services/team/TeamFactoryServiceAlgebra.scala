package org.mastermold.platform.domain.boundedcontexts.organizations.services.team

import org.mastermold.platform.domain.definitions.{ DomainEntity, DomainEntityFactoryServiceEffectfulAlgebra }

trait TeamFactoryServiceAlgebra[F[_], Repr, Aggregate <: DomainEntity]
    extends DomainEntityFactoryServiceEffectfulAlgebra[F, Repr, Aggregate]
