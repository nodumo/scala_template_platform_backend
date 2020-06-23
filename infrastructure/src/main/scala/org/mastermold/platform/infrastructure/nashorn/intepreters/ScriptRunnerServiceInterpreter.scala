package org.mastermold.platform.infrastructure.nashorn.intepreters

import java.io.StringWriter
import delight.nashornsandbox.NashornSandbox
import java.util.concurrent.ExecutorService
import org.mastermold.platform.infrastructure.nashorn.{
  DelightResult,
  JavascriptSource,
  NashornFactoryServiceAlgebra,
  ScriptRunnerServiceAlgebra
}
import org.mastermold.platform.infrastructure.nashorn.intepreters.{ ScriptRunnerServiceInterpreter => Interpreter }
import zio.{ IO, Task }

/**
 * Script runner service interpreter.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @usecase ZIO Script runner service
 * @param executorService Executor service
 * @param nashornFactoryService Nashorn factory service
 */
final class ScriptRunnerServiceInterpreter(
    executorService: ExecutorService,
    nashornFactoryService: NashornFactoryServiceAlgebra[Interpreter.ScriptFactoryFrom, Interpreter.ScriptFactoryTo])
    extends ScriptRunnerServiceAlgebra[Interpreter.F, Interpreter.ScriptSourceFrom, Interpreter.ScriptResultTo] {

  override def runScript(scriptSource: Interpreter.ScriptSourceFrom): Interpreter.F[Interpreter.ScriptResultTo] =
    IO.apply {
      val scriptRunner         = nashornFactoryService.create(executorService)
      val scriptRunnerBindings = scriptRunner.createBindings()
      val stringWriter         = new StringWriter()
      // Define environmental variables as bindings
      for ((bindingKey, bindingValue) <- scriptSource.bindings) {
        scriptRunnerBindings.put(bindingKey, bindingValue)
      }
      // Set writer to a String buffer
      scriptRunner.setWriter(stringWriter)
      DelightResult(scriptRunner.eval(scriptSource.source), stringWriter.toString)
    }

}

object ScriptRunnerServiceInterpreter {

  type F[A] = Task[A]

  type ScriptFactoryFrom = ExecutorService

  type ScriptFactoryTo = NashornSandbox

  type ScriptSourceFrom = JavascriptSource

  type ScriptResultTo = DelightResult

}
