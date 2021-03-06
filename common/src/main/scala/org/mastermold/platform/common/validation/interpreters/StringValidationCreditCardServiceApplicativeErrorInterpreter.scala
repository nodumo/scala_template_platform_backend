package org.mastermold.platform.common.validation.interpreters

import org.mastermold.platform.common.validation.{
  regexStrings,
  ApplicativeErrorValidationError,
  ErrorMessagesCollection,
  StringValidationCreditCardServiceAlgebra,
  ValidationError
}

import org.mastermold.platform.common.validation.interpreters.{
  StringValidationCreditCardServiceApplicativeErrorInterpreter => Interpreters
}

class StringValidationCreditCardServiceApplicativeErrorInterpreter[F[_]: ApplicativeErrorValidationError]
    extends ValidationServiceApplicativeErrorInterpreter[F]
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

object StringValidationCreditCardServiceApplicativeErrorInterpreter {

  // --- Validation: Errors

  private[interpreters] val Invalid_credit_card_master_amex_number: ValidationError.Repr =
    "Invalid_credit_card_master_amex_number"
  private[interpreters] val Invalid_credit_card_discover_card_number: ValidationError.Repr =
    "Invalid_credit_card_discover_card_number"
  private[interpreters] val Invalid_credit_card_master_card_number: ValidationError.Repr =
    "Invalid_credit_card_master_card_number"
  private[interpreters] val Invalid_credit_card_visa_mastercard_number: ValidationError.Repr =
    "Invalid_credit_card_visa_mastercard_number"
  private[interpreters] val Invalid_credit_card_visa_number: ValidationError.Repr =
    "Invalid_credit_card_visa_number"
  private[interpreters] val Invalid_credit_card_unioncard_pay_card_code: ValidationError.Repr =
    "Invalid_credit_card_unioncard_pay_card_code"

  private[interpreters] val rawErrorMessages: ErrorMessagesCollection =
    Set(
      Invalid_credit_card_master_amex_number,
      Invalid_credit_card_visa_mastercard_number,
      Invalid_credit_card_discover_card_number,
      Invalid_credit_card_master_card_number,
      Invalid_credit_card_visa_number,
      Invalid_credit_card_unioncard_pay_card_code
    )
}
