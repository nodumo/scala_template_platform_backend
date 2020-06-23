package org.mastermold.platform.common.validation.interpreters

import cats.MonadError
import org.mastermold.platform.common.validation.{ Predicate, ValidationError, ValidationServiceAlgebra }

/**
 * Validation service interpreter.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 * @param monadError Monad error
 */
abstract class ValidationServiceCatsInterpreter[F[_]](implicit monadError: MonadError[F, ValidationError])
    extends ValidationServiceAlgebra[F, ValidationError] {

  override def failure[A](validationError: ValidationError): F[A] = monadError.raiseError(validationError)

  override def success[A](a: A): F[A] = monadError.pure(a)

  override def validatedWithBool[Entity](bool: => Boolean, entity: Entity)(
      validationError: ValidationError): F[Entity] =
    if (bool) success(entity) else failure(validationError)

  override def validateWithFunction[Entity](predicate: Predicate[Entity], entity: Entity)(
      validationError: ValidationError): F[Entity] =
    if (predicate(entity)) success(entity) else failure(validationError)

}
