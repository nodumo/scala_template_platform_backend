package org.mastermold.platform.common.validation

/**
 * String date format validation algebra.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam F Effect
 */
trait StringValidationDateServiceAlgebra[F[_]] {

  def validateDateFormatYYYYMMDD(string: String): F[String]

  def validateDateTimeFormatYYYYMMDDHHMISS(string: String): F[String]

}
