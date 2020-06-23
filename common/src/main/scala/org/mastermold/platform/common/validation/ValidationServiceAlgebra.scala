package org.mastermold.platform.common.validation

/**
 * Validation service algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 */
trait ValidationServiceAlgebra[F[_], E] {

  /**
   * Failure
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param validationError Validation message
   */
  def failure[A](validationError: E): F[A]

  /**
   * Raise value into effect.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param a Success value
   */
  def success[A](a: A): F[A]

  /**
   * Validation service algebra.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param bool Predicate result
   * @param entity Entity
   * @param validationError Validation message
   */
  def validatedWithBool[Entity](bool: => Boolean, entity: Entity)(validationError: E): F[Entity]

  /**
   * Validation service algebra.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param predicate Predicate function to apply on entity
   * @param entity Entity
   * @param validationError Validation message
   */
  def validateWithFunction[Entity](predicate: Entity => Boolean, entity: Entity)(validationError: E): F[Entity]

}
