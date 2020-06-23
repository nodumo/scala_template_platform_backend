package org.mastermold.platform.application.libs

trait AppIntegrationTransactionScriptAlgebra [F[_], Command, Result] {

  def execute(command: Command): F[Result]

}
