package org.mastermold.platform.common.validation

/**
 * String application validation service algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 */
trait StringApplicationValidationServiceAlgebra[F[_]] {

  def applicationUsername(string: String): F[String]

  def applicationPassword(string: String): F[String]

  def applicationEntityTitle(string: String): F[String]

  def contentEmpty(string: String): F[String]

  def contentNotEmpty(string: String): F[String]

}
