package org.mastermold.platform.infrastructure.environment

/**
 * Environment value.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param value Environment value
 */
final case class EnvironmentValue(value: EnvironmentValue.Repr) extends AnyVal

object EnvironmentValue {

  type Repr = String

}
