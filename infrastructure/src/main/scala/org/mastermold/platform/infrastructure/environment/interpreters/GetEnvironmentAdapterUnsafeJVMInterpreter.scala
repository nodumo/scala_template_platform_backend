package org.mastermold.platform.infrastructure.environment.interpreters

import org.mastermold.platform.infrastructure.environment.GetEnvironmentAdapterServiceUnsafeAlgebra
import org.mastermold.platform.infrastructure.environment.interpreters.{
  GetEnvironmentAdapterUnsafeJVMInterpreter => Interpreter
}

/**
 * Unsafe environment as data.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 */
final class GetEnvironmentAdapterUnsafeJVMInterpreter
    extends GetEnvironmentAdapterServiceUnsafeAlgebra[Interpreter.Key, Interpreter.Value] {

  private val EMPTY_EMPTY: Interpreter.Value = ""

  override def getEnvironmentByKey(key: Interpreter.Key): Interpreter.Value =
    Option(System.getenv(key)).getOrElse(EMPTY_EMPTY)

}

object GetEnvironmentAdapterUnsafeJVMInterpreter {

  type Key = String

  type Value = String

}
