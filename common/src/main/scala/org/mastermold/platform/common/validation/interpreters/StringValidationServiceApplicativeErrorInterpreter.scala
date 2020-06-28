package org.mastermold.platform.common.validation.interpreters

import org.mastermold.platform.common.validation.{
  ApplicativeErrorValidationError,
  StringValidationServiceAlgebra,
  ValidationError
}
import scala.util.matching.Regex
import org.mastermold.platform.common.validation.interpreters.{
  StringValidationServiceApplicativeErrorInterpreter => Interpreter
}

class StringValidationServiceApplicativeErrorInterpreter[F[_]: ApplicativeErrorValidationError]
    extends ValidationServiceApplicativeErrorInterpreter[F]
    with StringValidationServiceAlgebra[F, Regex] {

  private val EMPTY_STRING_LENGTH: Int = 0

  private def isLongerThanPredicate(length: Int)(string: String): Boolean = string.length > length

  private def isShortThanPredicate(length: Int)(string: String): Boolean = string.length < length

  override def isLongerThan(length: Int)(string: String): F[String] =
    validatedWithBool(isLongerThanPredicate(length)(string), string)(
      ValidationError(Interpreter.Invalid_string_is_longer_than))

  override def isShorterThan(length: Int)(string: String): F[String] =
    validatedWithBool(isLongerThanPredicate(length)(string), string)(
      ValidationError(Interpreter.Invalid_string_is_shorter_than))

  override def isNotEmpty(string: String): F[String] =
    validatedWithBool(isLongerThanPredicate(EMPTY_STRING_LENGTH)(string), string)(
      ValidationError(Interpreter.Invalid_string_is_not_empty))

  override def isEmpty(string: String): F[String] =
    validatedWithBool(isShortThanPredicate(EMPTY_STRING_LENGTH)(string), string)(
      ValidationError(Interpreter.Invalid_string_is_empty))

  override def isMatchingRegex(regex: Regex)(string: String): F[String] =
    validatedWithBool(isShortThanPredicate(EMPTY_STRING_LENGTH)(string), string)(
      ValidationError(Interpreter.Invalid_string_is_matching_regex))

}

object StringValidationServiceApplicativeErrorInterpreter {

  private val Invalid_string_is_longer_than = "Invalid_credit_card_visa_number"

  private val Invalid_string_is_shorter_than = "Invalid_credit_card_visa_number"

  private val Invalid_string_is_not_empty = "Invalid_credit_card_visa_number"

  private val Invalid_string_is_empty = "Invalid_credit_card_visa_number"

  private val Invalid_string_is_matching_regex = "Invalid_credit_card_visa_number"

}
