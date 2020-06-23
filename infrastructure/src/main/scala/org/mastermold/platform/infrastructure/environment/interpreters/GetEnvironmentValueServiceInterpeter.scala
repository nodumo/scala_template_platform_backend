package org.mastermold.platform.infrastructure.environment.interpreters

import org.mastermold.platform.infrastructure.environment.{
  EnvironmentKey,
  EnvironmentValue,
  GetEnvironmentValueServiceAlgebra
}

/**
 * Get environment values service interpreter.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 */
final class GetEnvironmentValueServiceInterpeter[F[_]]
    extends GetEnvironmentValueServiceAlgebra[F, EnvironmentKey, EnvironmentValue] {

  def getEnvironmentByKey(key: EnvironmentKey): F[EnvironmentValue] = ???

}

object GetEnvironmentValueServiceInterpeter {

  def apply[F[_]]: GetEnvironmentValueServiceInterpeter[F] =
    new GetEnvironmentValueServiceInterpeter()

}
