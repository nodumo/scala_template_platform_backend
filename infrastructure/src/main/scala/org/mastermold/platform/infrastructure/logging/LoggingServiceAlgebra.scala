package org.mastermold.platform.infrastructure.logging

/**
 * Logging service algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 * @tparam Message Message
 */
trait LoggingServiceAlgebra[F[_], Message] {

  def debug(message: Message): F[Unit]

  def info(message: Message): F[Unit]

  def warn(message: Message): F[Unit]

  def danger(message: Message): F[Unit]

}
