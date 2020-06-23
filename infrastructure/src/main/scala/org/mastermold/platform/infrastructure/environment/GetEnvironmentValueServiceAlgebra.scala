package org.mastermold.platform.infrastructure.environment

/**
 * Get environment value from the current platform.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 * @tparam Key Key value
 * @tparam Value Environment value
 */
trait GetEnvironmentValueServiceAlgebra[F[_], Key, Value] {

  def getEnvironmentByKey(key: Key): F[Value]

}
