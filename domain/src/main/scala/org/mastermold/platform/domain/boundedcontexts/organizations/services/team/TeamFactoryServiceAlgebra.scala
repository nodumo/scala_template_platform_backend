package org.mastermold.platform.domain.boundedcontexts.organizations.services.team

import org.mastermold.platform.common.softwarepatterns.FactoryServiceEffectfulAlgebra

trait TeamFactoryServiceAlgebra[F[_], Repr, Aggregate] extends FactoryServiceEffectfulAlgebra[F, Repr, Aggregate]
