package org.mastermold.platform.infrastructure.repositiories.doobie.interpreters

import cats.effect.{ Async, ContextShift }
import doobie.util.transactor.Transactor
import org.mastermold.platform.infrastructure.repositiories.doobie.{ JDBConfig, TransactorFactoryServiceAlgebra }
import org.mastermold.platform.infrastructure.repositiories.doobie.interpreters.{
  TransactorFactoryServiceInterpreter => Interpreter
}

/**
 * Transactor factory service interpreter.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 */
final class TransactorFactoryServiceInterpreter[F[_]: ContextShift: Async]
    extends TransactorFactoryServiceAlgebra[Interpreter.From, Interpreter.To[F]] {

  override def create(from: Interpreter.From): Interpreter.To[F] =
    Transactor.fromDriverManager[F](
      from.driver,
      from.url,
      from.username,
      from.password
    )

}

object TransactorFactoryServiceInterpreter {

  type From = JDBConfig

  type To[F[_]] = Transactor[F]

  def apply[F[_]: ContextShift: Async]: TransactorFactoryServiceInterpreter[F] =
    new TransactorFactoryServiceInterpreter()

}
