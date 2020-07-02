package org.mastermold.platform.infrastructure.environment

/**
 * Environment value.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @param value Environment value
 */
final case class EnvironmentValue(value: EnvironmentValue.Repr) extends AnyVal

object EnvironmentValue {

  type Repr = String

}
