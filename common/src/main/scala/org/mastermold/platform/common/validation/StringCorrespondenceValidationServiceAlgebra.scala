package org.mastermold.platform.common.validation

trait StringCorrespondenceValidationServiceAlgebra[F[_]] {

  def phoneNumber7DigitDecimals(string: String): F[String]

  def phoneNumber9DigitDecimals(string: String): F[String]

}
