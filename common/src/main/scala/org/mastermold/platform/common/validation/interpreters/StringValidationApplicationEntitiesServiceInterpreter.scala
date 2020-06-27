package org.mastermold.platform.common.validation.interpreters

import org.mastermold.platform.common.validation.{
  regexStrings,
  ErrorMessagesCollection,
  ApplicativeErrorValidationError,
  StringValidationApplicationEntitiesServiceAlgebra,
  ValidationError
}
import org.mastermold.platform.common.validation.interpreters.{
  StringValidationApplicationEntitiesServiceInterpreter => Interpreter
}

/**
  * String application validation service.
  *
  * @author Nick Odumo (nodumo@nodumo.com).
  * @tparam F Applicative error
  */
final class StringValidationApplicationEntitiesServiceInterpreter[F[_] : ApplicativeErrorValidationError]
  extends ValidationServiceApplicativeErrorInterpreter[F]
    with ValidationServiceStringMixinInterpreter[F, ValidationError]
    with StringValidationApplicationEntitiesServiceAlgebra[F] {

  override def applicationUsername(string: String): F[String] =
    validateRegex(regexStrings.applicationUsername, string)(ValidationError(Interpreter.Invalid_application_username))

  override def applicationPassword(string: String): F[String] =
    validateRegex(regexStrings.applicationPassword, string)(ValidationError(Interpreter.Invalid_application_password))

  override def applicationEntityTitle(string: String): F[String] =
    validateRegex(regexStrings.applicationEntityTitle, string)(
      ValidationError(Interpreter.Invalid_application_entity_title))

  override def contentEmpty(string: String): F[String] =
    validateRegex(regexStrings.contentEmpty, string)(ValidationError(Interpreter.Invalid_application_empty_string))

  override def contentNotEmpty(string: String): F[String] =
    validateRegex(regexStrings.contentNotEmpty, string)(
      ValidationError(Interpreter.Invalid_application_not_empty_string))

}

object StringValidationApplicationEntitiesServiceInterpreter {

  private[common] val Invalid_application_username = "Invalid_application_username"

  private[common] val Invalid_application_password = "Invalid_application_password"

  private[common] val Invalid_application_entity_title = "Invalid_application_entity_title"

  private[common] val Invalid_application_empty_string = "Invalid_application_empty_string"

  private[common] val Invalid_application_not_empty_string = "Invalid_application_not_empty_string"

  private[common] val rawErrorMessages: ErrorMessagesCollection = Set(
    Invalid_application_username,
    Invalid_application_password,
    Invalid_application_entity_title,
    Invalid_application_empty_string,
    Invalid_application_not_empty_string
  )

  def apply[F[_] : ApplicativeErrorValidationError]: StringValidationApplicationEntitiesServiceInterpreter[F] =
    new StringValidationApplicationEntitiesServiceInterpreter()

}
