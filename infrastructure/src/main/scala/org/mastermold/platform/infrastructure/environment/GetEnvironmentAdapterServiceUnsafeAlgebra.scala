package org.mastermold.platform.infrastructure.environment

/**
 * Environment unsafe adapter.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @usecase Environment unsafe
 * @tparam Key Key
 * @tparam Value Value
 */
trait GetEnvironmentAdapterServiceUnsafeAlgebra[Key, Value] {

  def getEnvironmentByKey(key: Key): Value

}
