package org.mastermold.platform.common.validation

/**
 * String date format validation algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 */
trait StringValidationDateServiceAlgebra[F[_]] {

  def validateDateFormatYYYYMMDD(string: String): F[String]

  def validateDateTimeFormatYYYYMMDDHHMISS(string: String): F[String]

}
