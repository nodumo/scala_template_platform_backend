package org.mastermold.platform.domain.definitions

/**
 * Invariant domain object.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam A Domain entity
 * @param value Domain entity.
 */
final case class CheckedInvariant[A <: DomainEntity] private[domain] (value: A) extends AnyVal
