package org.mastermold.platform.infrastructure.execution.interpreters

import java.util.concurrent.{ ExecutorService, Executors }
import org.mastermold.platform.common.softwarepatterns.FactoryServiceAlgebra
import org.mastermold.platform.infrastructure.execution.ProcessorCount
import org.mastermold.platform.infrastructure.execution.interpreters.{
  ExecutionContextFactoryServiceJavaExecutorServiceInterpreter => Interpreter
}

/**
 * Execution context factory service.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @usecase Create an execution context from a processor count
 */
final class ExecutionContextFactoryServiceJavaExecutorServiceInterpreter
    extends FactoryServiceAlgebra[Interpreter.From, Interpreter.To] {

  override def create(from: Interpreter.From): Interpreter.To =
    Executors.newFixedThreadPool(from.value)

}

object ExecutionContextFactoryServiceJavaExecutorServiceInterpreter {

  type From = ProcessorCount

  type To = ExecutorService

  def apply: Interpreter = new ExecutionContextFactoryServiceJavaExecutorServiceInterpreter()

}
