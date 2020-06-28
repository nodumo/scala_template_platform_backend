package org.mastermold.platform.common.validation.interpreters

import org.mastermold.platform.common.validation.{
  regexStrings,
  ApplicativeErrorValidationError,
  StringValidationJavaLiteralsServiceAlgebra,
  ValidationError
}

class StringValidationJavaLiteralsServiceInterpreter[F[_]: ApplicativeErrorValidationError]
    extends ValidationServiceApplicativeErrorInterpreter[F]
    with StringValidationJavaLiteralsServiceAlgebra[F] {

  override def validateUUID(string: String): F[String] =
    validateRegex(regexStrings.networkEmail, string)(ValidationError(""))

}

object StringValidationJavaLiteralsServiceInterpreter {}
