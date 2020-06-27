package org.mastermold.platform.domain.definitions

/**
 * Invariant domain object.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam A Domain entity
 * @param value Domain entity.
 */
final case class Invariant[A <: DomainEntity] private[domain] (value: A) extends AnyVal
