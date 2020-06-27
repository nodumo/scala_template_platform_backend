package org.mastermold.platform.common.validation

import org.mastermold.platform.common.validation.syntax.RegexExtension

/**
 * String length validation service algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 */
trait StringValidationServiceAlgebra[F[_]] {
  
  /**
    * Validate that the string is longer than.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @param length String is longer than.
    */
  def isLongerThan(length: Int)(string: String): F[String]

  /**
    * Validate that the string is shorter than.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @param length String is shorter than.
    */
  def isShorterThan(length: Int)(string: String): F[String]

  /**
    * Validate that the string is longer than.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @param length String is longer than.
    * @param regex Regular  expression to test.
    */
  def isMatchingRegex(length: Int)(regex: RegexExtension): F[String]

}
