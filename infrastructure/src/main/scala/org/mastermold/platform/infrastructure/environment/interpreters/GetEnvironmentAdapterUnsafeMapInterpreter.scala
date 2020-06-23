package org.mastermold.platform.infrastructure.environment.interpreters

import org.mastermold.platform.infrastructure.environment.GetEnvironmentAdapterServiceUnsafeAlgebra
import org.mastermold.platform.infrastructure.environment.interpreters.{
  GetEnvironmentAdapterUnsafeMapInterpreter => Interpreter
}

/**
 * Unsafe environment as data.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @usecase Reading environment from map.
 * @param environment Environment map
 */
final class GetEnvironmentAdapterUnsafeMapInterpreter(environment: Interpreter.Environment)
    extends GetEnvironmentAdapterServiceUnsafeAlgebra[Interpreter.Key, Interpreter.Value] {

  private val EMPTY_EMPTY: String = ""

  override def getEnvironmentByKey(key: Interpreter.Key): Interpreter.Value = environment.getOrElse(key, EMPTY_EMPTY)

}

object GetEnvironmentAdapterUnsafeMapInterpreter {

  type Environment = Map[Interpreter.Key, Interpreter.Value]

  type Key = String

  type Value = String

  def apply(map: Environment): Interpreter =
    new GetEnvironmentAdapterUnsafeMapInterpreter(map)

}
