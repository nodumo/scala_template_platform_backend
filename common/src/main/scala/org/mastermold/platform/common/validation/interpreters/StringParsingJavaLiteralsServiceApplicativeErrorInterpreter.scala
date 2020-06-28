package org.mastermold.platform.common.validation.interpreters

import java.util.UUID

import org.mastermold.platform.common.validation.{
  ApplicativeErrorValidationError,
  StringParsingJavaLiteralsServiceAlgebra,
  StringValidationJavaLiteralsServiceAlgebra
}

class StringParsingJavaLiteralsServiceApplicativeErrorInterpreter[F[_]: ApplicativeErrorValidationError](
    stringValidationJavaLiteralsService: StringValidationJavaLiteralsServiceAlgebra[F])
    extends StringParsingJavaLiteralsServiceAlgebra[F, UUID] {

  override def parseUUID(string: String): F[UUID] = {
    println(stringValidationJavaLiteralsService)
    ???
  }

}
