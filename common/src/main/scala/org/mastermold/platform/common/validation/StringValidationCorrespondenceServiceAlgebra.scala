package org.mastermold.platform.common.validation


/**
  * String validate correspondence values
  *
  * @author Nick Odumo (nodumo@nodumo.com)
  * @tparam F Effect
  */
trait StringValidationCorrespondenceServiceAlgebra[F[_]] {

  def phoneNumber7DigitDecimals(string: String): F[String]

  def phoneNumber9DigitDecimals(string: String): F[String]

}
