package org.mastermold.platform.common.validation.interpreters

import cats.ApplicativeError
import org.mastermold.platform.common.validation.{Predicate, ValidationError, ValidationServiceAlgebra}

/**
 * Validation service interpreter.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 * @param monadApplicative Monad error
 */
abstract class ValidationServiceApplicativeErrorInterpreter[F[_]](implicit monadApplicative: ApplicativeError[F, ValidationError])
    extends ValidationServiceAlgebra[F, ValidationError] {

  /**
    * Smart-constructor for applicative error channel.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @tparam E Error channel
    * @param errorValue Error value
    */
  override def failure[E](errorValue: ValidationError): F[E] = monadApplicative.raiseError(errorValue)

  /**
    * Smart-constructor for applicative success channel.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @tparam A Value channel
    * @param successValue Success value
    */
  override def success[A](successValue: A): F[A] = monadApplicative.pure(successValue)

  /**
    * Validated with condition.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @tparam Entity Value
    * @param bool Condition to evaluate for truth
    * @param entity Entity to put in the success channel
    */
  override def validatedWithBool[Entity](bool: => Boolean, entity: Entity)(
      validationError: ValidationError): F[Entity] =
    if (bool) success(entity) else failure(validationError)

  /**
    * Validated with predicate application.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @tparam Entity Value
    * @param predicate Predicate to check on the given entity
    * @param entity Entity to apply predicate on
    */
  override def validateWithFunction[Entity](predicate: Predicate[Entity], entity: Entity)(
      validationError: ValidationError): F[Entity] =
    if (predicate(entity)) success(entity) else failure(validationError)

}
