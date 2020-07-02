package org.mastermold.platform.infrastructure.environment

/**
 * Environment key.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @param value Environment key
 */
final case class EnvironmentKey(value: EnvironmentKey.Repr) extends AnyVal

object EnvironmentKey {

  type Repr = String

}
