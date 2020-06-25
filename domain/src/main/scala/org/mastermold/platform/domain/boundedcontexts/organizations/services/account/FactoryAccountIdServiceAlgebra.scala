package org.mastermold.platform.domain.boundedcontexts.organizations.services.account

import org.mastermold.platform.common.softwarepatterns.FactoryServiceEffectfulAlgebra

trait FactoryAccountIdServiceAlgebra[F[_], Repr, Aggregate] extends FactoryServiceEffectfulAlgebra[F, Repr, Aggregate]
