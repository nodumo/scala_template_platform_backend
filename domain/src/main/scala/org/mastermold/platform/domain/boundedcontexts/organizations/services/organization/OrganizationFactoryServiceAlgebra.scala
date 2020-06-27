package org.mastermold.platform.domain.boundedcontexts.organizations.services.organization

import org.mastermold.platform.domain.definitions.{ DomainEntity, DomainEntityFactoryServiceEffectfulAlgebra }

trait OrganizationFactoryServiceAlgebra[F[_], Repr, Aggregate <: DomainEntity]
    extends DomainEntityFactoryServiceEffectfulAlgebra[F, Repr, Aggregate]
