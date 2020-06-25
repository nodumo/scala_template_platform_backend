package org.mastermold.platform.domain.boundedcontexts.organizations.services.person

import org.mastermold.platform.common.softwarepatterns.FactoryServiceEffectfulAlgebra

trait PersonFactoryServiceAlgebra[F[_], Repr, Aggregate] extends FactoryServiceEffectfulAlgebra[F, Repr, Aggregate]
 