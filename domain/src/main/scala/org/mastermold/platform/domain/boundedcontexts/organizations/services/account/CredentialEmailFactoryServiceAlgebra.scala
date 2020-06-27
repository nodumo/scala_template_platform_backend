package org.mastermold.platform.domain.boundedcontexts.organizations.services.account

import org.mastermold.platform.domain.definitions.{ DomainEntity, DomainEntityFactoryServiceEffectfulAlgebra }

trait CredentialEmailFactoryServiceAlgebra[F[_], Repr, Value <: DomainEntity]
    extends DomainEntityFactoryServiceEffectfulAlgebra[F, Repr, Value]
