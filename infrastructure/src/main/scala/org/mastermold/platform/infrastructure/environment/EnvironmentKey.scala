package org.mastermold.platform.infrastructure.environment

/**
 * Environment key.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param value Environment key
 */
final case class EnvironmentKey(value: EnvironmentKey.Repr) extends AnyVal

object EnvironmentKey {

  type Repr = String

}
