package org.mastermold.platform.common.validation

/**
 * String validate correspondence values.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam F Effect
 */
trait StringValidationCorrespondenceServiceAlgebra[F[_]] {

  /**
   * Validate 9-digit phone number.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param string String to test
   */
  def phoneNumber9DigitDecimals(string: String): F[String]

}
