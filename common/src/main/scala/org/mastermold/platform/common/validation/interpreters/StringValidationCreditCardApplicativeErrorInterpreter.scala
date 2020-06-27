package org.mastermold.platform.common.validation.interpreters

import org.mastermold.platform.common.validation.{
  regexStrings,
  ErrorMessagesCollection,
  ApplicativeErrorValidationError,
  StringValidationCreditCardServiceAlgebra,
  ValidationError
}

import org.mastermold.platform.common.validation.interpreters.{
  StringValidationCreditCardApplicativeErrorInterpreter => Interpreters
}

/**
 * Validation credit-card interpreter.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @usecase Validating Credit Card values for the commerce related domains.
 *         It is important that we hide the credit card values from the log.
 * @tparam F Monad-error
 */
final class StringValidationCreditCardApplicativeErrorInterpreter[F[_]: ApplicativeErrorValidationError]
    extends ValidationServiceApplicativeErrorInterpreter[F]
    with ValidationServiceStringMixinInterpreter[F, ValidationError]
    with StringValidationCreditCardServiceAlgebra[F] {

  override def validateCreditCardMasterAmexNumber(string: String): F[String] =
    validateRegex(regexStrings.creditCardMasterAmexNumber, string)(
      ValidationError(Interpreters.Invalid_credit_card_master_amex_number))

  override def validateCreditCardDiscoverCardNumber(string: String): F[String] =
    validateRegex(regexStrings.creditCardDiscoverCardNumber, string)(
      ValidationError(Interpreters.Invalid_credit_card_discover_card_number))

  override def validateCreditCardMasterCardNumber(string: String): F[String] =
    validateRegex(regexStrings.creditCardMasterCardNumber, string)(
      ValidationError(Interpreters.Invalid_credit_card_master_card_number))

  override def validateCreditCardVisaNumber(string: String): F[String] =
    validateRegex(regexStrings.creditCardVisaMasterCardNumber, string)(
      ValidationError(Interpreters.Invalid_credit_card_visa_number))

  override def validateCreditCardVisaMasterCardNumber(string: String): F[String] =
    validateRegex(regexStrings.creditCardVisaMasterCardNumber, string)(
      ValidationError(Interpreters.Invalid_credit_card_visa_mastercard_number))

  override def validateCreditCardUnionPayCardCode(string: String): F[String] =
    validateRegex(regexStrings.creditCardUnionPayCardCode, string)(
      ValidationError(Interpreters.Invalid_credit_card_visa_mastercard_number))

}

object StringValidationCreditCardApplicativeErrorInterpreter {

  private val Invalid_credit_card_master_amex_number = "Invalid_credit_card_master_amex_number"

  private val Invalid_credit_card_discover_card_number = "Invalid_credit_card_discover_card_number"

  private val Invalid_credit_card_master_card_number = "Invalid_credit_card_master_card_number"

  private val Invalid_credit_card_visa_mastercard_number = "Invalid_credit_card_visa_mastercard_number"

  private val Invalid_credit_card_visa_number = "Invalid_credit_card_visa_number"

  private val Invalid_credit_card_unioncard_pay_card_code = "Invalid_credit_card_unioncard_pay_card_code"

  val rawErrorMessages: ErrorMessagesCollection =
    Set(
      Invalid_credit_card_master_amex_number,
      Invalid_credit_card_visa_mastercard_number,
      Invalid_credit_card_discover_card_number,
      Invalid_credit_card_master_card_number,
      Invalid_credit_card_visa_number,
      Invalid_credit_card_unioncard_pay_card_code
    )

  def apply[F[_]: ApplicativeErrorValidationError]: StringValidationCreditCardApplicativeErrorInterpreter[F] =
    new StringValidationCreditCardApplicativeErrorInterpreter()

}
