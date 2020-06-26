package org.mastermold.platform.domain.boundedcontexts.organizations.services.organization

import org.mastermold.platform.common.softwarepatterns.FactoryServiceEffectfulAlgebra

trait OrganizationFactoryServiceAlgebra[F[_], Repr, Aggregate]
    extends FactoryServiceEffectfulAlgebra[F, Repr, Aggregate]
