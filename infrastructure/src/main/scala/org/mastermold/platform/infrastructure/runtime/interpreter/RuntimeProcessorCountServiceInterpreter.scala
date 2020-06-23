package org.mastermold.platform.infrastructure.runtime.interpreter

import org.mastermold.platform.infrastructure.runtime.RuntimeProcessorCountServiceAlgebra
import org.mastermold.platform.infrastructure.runtime.interpreter.{
  RuntimeProcessorCountServiceInterpreter => Interpreter
}

/**
 * Runtime processor count services interpreter.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 */
final class RuntimeProcessorCountServiceInterpreter extends RuntimeProcessorCountServiceAlgebra[Interpreter.Count] {

  override val availableProcessors: Interpreter.Count = Runtime.getRuntime.availableProcessors()

}

object RuntimeProcessorCountServiceInterpreter {

  type Count = Int

}
