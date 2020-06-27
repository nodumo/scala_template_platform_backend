package org.mastermold.platform.common.validation

/**
 * String credit-card validation  algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @usecase Validating credit-card related values
 * @tparam F Effect
 */
trait StringValidationCreditCardServiceAlgebra[F[_]] {

  def validateCreditCardMasterAmexNumber(string: String): F[String]

  def validateCreditCardDiscoverCardNumber(string: String): F[String]

  def validateCreditCardMasterCardNumber(string: String): F[String]

  def validateCreditCardVisaNumber(string: String): F[String]

  def validateCreditCardVisaMasterCardNumber(string: String): F[String]

  def validateCreditCardUnionPayCardCode(string: String): F[String]

}
