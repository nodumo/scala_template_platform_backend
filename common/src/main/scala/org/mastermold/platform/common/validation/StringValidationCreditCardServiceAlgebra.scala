package org.mastermold.platform.common.validation

/**
  * String credit-card validation  algebra.
  *
  * @author Nick Odumo (nodumo@nodumo.com)
  * @usecase Validating credit-card related values
  * @tparam F Effect
  */
trait StringValidationCreditCardServiceAlgebra[F[_]] {

  /**
    * Validate credit-card Master Amex number.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @param string String to test
    */
  def validateCreditCardMasterAmexNumber(string: String): F[String]

  /**
    * Validate credit-card Master Amex number.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @param string String to test
    */
  def validateCreditCardDiscoverCardNumber(string: String): F[String]

  /**
    * Validate credit-card Mastercard number.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @param string String to test
    */
  def validateCreditCardMasterCardNumber(string: String): F[String]

  /**
    * Validate credit-card Visa number.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @param string String to test
    */
  def validateCreditCardVisaNumber(string: String): F[String]

  /**
    * Validate credit-card Visa Mastercard number.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @param string String to test
    */
  def validateCreditCardVisaMasterCardNumber(string: String): F[String]

  /**
    * Validate credit-card Union Pay Card code.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @param string String to test
    */
  def validateCreditCardUnionPayCardCode(string: String): F[String]

}
