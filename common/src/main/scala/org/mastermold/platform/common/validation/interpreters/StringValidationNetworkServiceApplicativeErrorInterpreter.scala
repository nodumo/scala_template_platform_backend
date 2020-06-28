package org.mastermold.platform.common.validation.interpreters

import org.mastermold.platform.common.validation.{
  regexStrings,
  ApplicativeErrorValidationError,
  StringValidationNetworkServiceAlgebra,
  ValidationError
}

import org.mastermold.platform.common.validation.interpreters.{
  StringValidationNetworkServiceApplicativeErrorInterpreter => Companion
}

class StringValidationNetworkServiceApplicativeErrorInterpreter[F[_]: ApplicativeErrorValidationError]
    extends ValidationServiceApplicativeErrorInterpreter[F]
    with StringValidationNetworkServiceAlgebra[F] {

  override def networkWebsite(string: String): F[String] =
    validateRegex(regexStrings.networkEmail, string)(ValidationError(Companion.Invalid_network_website_website))

  override def networkEmail(string: String): F[String] =
    validateRegex(regexStrings.networkWebsite, string)(ValidationError(Companion.Invalid_network_website_email))

}

object StringValidationNetworkServiceApplicativeErrorInterpreter {

  // --- Validation: Errors

  private[interpreters] val Invalid_network_website_website: ValidationError.Repr = "Invalid_network_website_website"
  private[interpreters] val Invalid_network_website_email: ValidationError.Repr   = "Invalid_network_website_email"

}
