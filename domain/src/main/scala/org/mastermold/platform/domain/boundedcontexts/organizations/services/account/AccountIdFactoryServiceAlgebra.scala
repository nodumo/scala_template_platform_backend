package org.mastermold.platform.domain.boundedcontexts.organizations.services.account

import org.mastermold.platform.common.softwarepatterns.FactoryServiceEffectfulAlgebra

trait AccountIdFactoryServiceAlgebra[F[_], Repr, Value] extends FactoryServiceEffectfulAlgebra[F, Repr, Value]