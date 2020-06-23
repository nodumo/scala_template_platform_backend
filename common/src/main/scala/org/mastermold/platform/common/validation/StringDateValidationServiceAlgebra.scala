package org.mastermold.platform.common.validation

/**
 * Sequence validation algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 */
trait StringDateValidationServiceAlgebra[F[_]] {

  def validateDateFormatYYYYMMDD(string: String): F[String]

  def validateDateTimeFormatYYYYMMDDHHMISS(string: String): F[String]

}
