package org.mastermold.platform.infrastructure.environment

/**
 * Environment unsafe adapter.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @usecase Environment unsafe
 * @tparam Key Key
 * @tparam Value Value
 */
trait GetEnvironmentAdapterServiceUnsafeAlgebra[Key, Value] {

  def getEnvironmentByKey(key: Key): Value

}
