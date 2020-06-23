package org.mastermold.platform.infrastructure.nashorn

trait ScriptRunnerServiceAlgebra[F[_], ScriptSource, Result] {

  def runScript(scriptSource: ScriptSource): F[Result]

}
