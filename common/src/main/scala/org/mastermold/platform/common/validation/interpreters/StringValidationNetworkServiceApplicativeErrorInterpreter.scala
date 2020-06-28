package org.mastermold.platform.common.validation.interpreters

import org.mastermold.platform.common.validation.{
  regexStrings,
  ApplicativeErrorValidationError,
  ErrorMessagesCollection,
  StringValidationNetworkServiceAlgebra,
  ValidationError
}
import org.mastermold.platform.common.validation.interpreters.{
  StringValidationNetworkServiceApplicativeErrorInterpreter => Companion
}

class StringValidationNetworkServiceApplicativeErrorInterpreter[F[_]: ApplicativeErrorValidationError]
    extends ValidationServiceApplicativeErrorInterpreter[F]
    with StringValidationNetworkServiceAlgebra[F] {

  override def networkEmail(string: String): F[String] =
    validateRegex(regexStrings.networkWebsite, string)(ValidationError(Companion.Invalid_network_website_email))

  override def networkWebsite(string: String): F[String] =
    validateRegex(regexStrings.networkEmail, string)(ValidationError(Companion.Invalid_network_website_website))
}

object StringValidationNetworkServiceApplicativeErrorInterpreter {

  // --- Validation: Errors

  private[interpreters] val Invalid_network_website_email: ValidationError.Repr   = "Invalid_network_website_email"
  private[interpreters] val Invalid_network_website_website: ValidationError.Repr = "Invalid_network_website_website"

  private[interpreters] val rawErrorMessages: ErrorMessagesCollection =
    Set(
      Invalid_network_website_website,
      Invalid_network_website_email
    )
}
