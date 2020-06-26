package org.mastermold.platform.infrastructure.nashorn.intepreters

import java.io.StringWriter

import delight.nashornsandbox.NashornSandbox
import java.util.concurrent.ExecutorService

import cats.effect.Sync
import org.mastermold.platform.infrastructure.nashorn.{
  DelightResult,
  JavascriptSource,
  NashornFactoryServiceAlgebra,
  ScriptRunnerServiceAlgebra
}
import org.mastermold.platform.infrastructure.nashorn.intepreters.{ ScriptRunnerServiceInterpreter => Interpreter }

/**
 * Script runner service interpreter.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @usecase Effectful Script runner service
 *          Uses effect type-classes from Cats, may at some point switch to some other effect
 *          system
 * @todo Investigate the use of some sort of logging effect so that
 *       the input script can be adequately described
 * @tparam F Side-effect capturing monad
 * @param executorService       Executor service
 * @param nashornFactoryService Nashorn factory service
 */
final class ScriptRunnerServiceInterpreter[F[_]: Sync](
    executorService: ExecutorService,
    nashornFactoryService: NashornFactoryServiceAlgebra[Interpreter.ScriptFactoryFrom, Interpreter.ScriptFactoryTo])
    extends ScriptRunnerServiceAlgebra[F, Interpreter.ScriptSourceFrom, Interpreter.ScriptResultTo] {

  override def runScript(scriptSource: Interpreter.ScriptSourceFrom): F[Interpreter.ScriptResultTo] =
    implicitly[Sync[F]].delay {
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

  type ScriptFactoryFrom = ExecutorService

  type ScriptFactoryTo = NashornSandbox

  type ScriptSourceFrom = JavascriptSource

  type ScriptResultTo = DelightResult

}
