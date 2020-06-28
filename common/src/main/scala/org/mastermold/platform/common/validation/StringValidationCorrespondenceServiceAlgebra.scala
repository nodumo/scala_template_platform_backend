package org.mastermold.platform.common.validation

/**
 * String validate correspondence values.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 */
trait StringValidationCorrespondenceServiceAlgebra[F[_]] {

  /**
   * Validate 9-digit phone number.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param string String to test
   */
  def phoneNumber9DigitDecimals(string: String): F[String]

}
