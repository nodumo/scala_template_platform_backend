package org.mastermold.platform.common.validation

/**
 * Numeric generalized numeric.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 */
trait SimpleNumericValidationServiceAlgebra[F[_]] {

  def validateByte(string: String): F[String]

  def validate(string: String): F[String]

}
