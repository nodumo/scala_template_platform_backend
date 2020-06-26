package org.mastermold.platform.infrastructure.repositiories.doobie.interpreters

import cats.effect.{ Async, ContextShift }
import doobie.util.transactor.Transactor
import org.mastermold.platform.infrastructure.repositiories.doobie.{
  DoobieDriverConfig,
  DoobieTransactorFactoryServiceAlgebra
}
import org.mastermold.platform.infrastructure.repositiories.doobie.interpreters.{
  DoobieTransactorFactoryServiceInterpreter => Interpreter
}

/**
 * Transactor factory service interpreter.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 */
final class DoobieTransactorFactoryServiceInterpreter[F[_]: ContextShift: Async]
    extends DoobieTransactorFactoryServiceAlgebra[Interpreter.From, Interpreter.To[F]] {

  /**
   * Take configuration and produce transactor.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param from Configuration object
   */
  override def create(from: Interpreter.From): Interpreter.To[F] =
    Transactor.fromDriverManager[F](
      from.driver,
      from.url,
      from.username,
      from.password
    )

}

object DoobieTransactorFactoryServiceInterpreter {

  type From = DoobieDriverConfig

  type To[F[_]] = Transactor[F]

  def apply[F[_]: ContextShift: Async]: DoobieTransactorFactoryServiceInterpreter[F] =
    new DoobieTransactorFactoryServiceInterpreter()

}
