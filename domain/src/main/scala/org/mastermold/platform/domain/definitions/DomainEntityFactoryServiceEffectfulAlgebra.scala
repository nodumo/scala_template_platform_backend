package org.mastermold.platform.domain.definitions

import org.mastermold.platform.common.softwarepatterns.FactoryServiceEffectfulAlgebra

/**
 * Checked invariant domain type.
 *
 * In domain driven design (FP especially) it is a commonly establish principle that
 * we should seek to work with checked invariant types to prevent unwanted states from arising in the application.
 *
 * @author Nick Odumo (nodumowebdev@gmail.com)
 * @tparam F Effect
 * @tparam Repr Domain entity
 * @tparam DomainEntityT Domain entity type
 */
trait DomainEntityFactoryServiceEffectfulAlgebra[F[_], Repr, DomainEntityT <: DomainEntity]
    extends FactoryServiceEffectfulAlgebra[F, Repr, CheckedInvariant[DomainEntityT]]
