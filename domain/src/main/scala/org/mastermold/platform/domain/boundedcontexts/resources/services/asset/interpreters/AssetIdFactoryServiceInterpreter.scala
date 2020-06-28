package org.mastermold.platform.domain.boundedcontexts.resources.services.asset.interpreters

import cats.syntax.functor._
import org.mastermold.platform.common.validation.{
  ApplicativeErrorValidationError,
  StringValidationJavaLiteralsServiceAlgebra
}
import org.mastermold.platform.domain.boundedcontexts.resources.models.asset.AssetId
import org.mastermold.platform.domain.boundedcontexts.resources.services.asset.AssetIdFactoryServiceAlgebra
import org.mastermold.platform.domain.definitions.CheckedInvariant

class AssetIdFactoryServiceInterpreter[F[_]: ApplicativeErrorValidationError](
    stringValidationJavaLiteralsService: StringValidationJavaLiteralsServiceAlgebra[F])
    extends AssetIdFactoryServiceAlgebra[F, AssetId.Repr, AssetId] {

  override def create(from: AssetId.Repr): F[CheckedInvariant[AssetId]] =
    for {
      _ <- stringValidationJavaLiteralsService.validateUUID(from)
    } yield CheckedInvariant(AssetId(from))

}

object AssetIdFactoryServiceInterpreter {

  def apply[F[_]: ApplicativeErrorValidationError](
      stringValidationJavaLiteralsService: StringValidationJavaLiteralsServiceAlgebra[F])
    : AssetIdFactoryServiceInterpreter[F] =
    new AssetIdFactoryServiceInterpreter(stringValidationJavaLiteralsService)

}
