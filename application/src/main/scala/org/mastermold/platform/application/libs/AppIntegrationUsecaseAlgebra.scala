package org.mastermold.platform.application.libs

trait AppIntegrationUsecaseAlgebra[F[_], Command, Result] {

  def run(command: Command): F[Result]

}
