package org.mastermold.platform.common.validation.interpreters

import org.mastermold.platform.common.validation.{
  regexStrings,
  ErrorMessagesCollection,
  MonadErrorValidationError,
  StringApplicationValidationServiceAlgebra,
  ValidationError
}
import org.mastermold.platform.common.validation.interpreters.{
  StringApplicationValidationServiceInterpreter => Interpreter
}

/**
 * String application validation service.
 *
 * @author Nick Odumo (nodumo@nodumo.com).
 * @tparam F Monad-error
 */
final class StringApplicationValidationServiceInterpreter[F[_]: MonadErrorValidationError]
    extends ValidationServiceCatsInterpreter[F]
    with ValidationServiceStringMixinInterpreter[F, ValidationError]
    with StringApplicationValidationServiceAlgebra[F] {

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

object StringApplicationValidationServiceInterpreter {

  private val Invalid_application_username = "Invalid_application_username"

  private val Invalid_application_password = "Invalid_application_password"

  private val Invalid_application_entity_title = "Invalid_application_entity_title"

  private val Invalid_application_empty_string = "Invalid_application_empty_string"

  private val Invalid_application_not_empty_string = "Invalid_application_not_empty_string"

  val rawErrorMessages: ErrorMessagesCollection = Set(
    Invalid_application_username,
    Invalid_application_password,
    Invalid_application_entity_title,
    Invalid_application_empty_string,
    Invalid_application_not_empty_string
  )

  def apply[F[_]: MonadErrorValidationError]: StringApplicationValidationServiceInterpreter[F] =
    new StringApplicationValidationServiceInterpreter()

}
