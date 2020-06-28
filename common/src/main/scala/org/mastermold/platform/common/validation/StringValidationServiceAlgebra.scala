package org.mastermold.platform.common.validation

/**
 * String length validation service algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F      Effect
 * @tparam Regex Regular expression representation
 */
trait StringValidationServiceAlgebra[F[_], Regex] {

  /**
   * Validate that the string is longer than.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param length String is longer than.
   * @param string String to test
   */
  def isLongerThan(length: Int)(string: String): F[String]

  /**
   * Validate that the string is shorter than.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param length String is shorter than
   * @param string String to test
   */
  def isShorterThan(length: Int)(string: String): F[String]

  /**
   * Validate that the string is not empty.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param string String to test
   */
  def isNotEmpty(string: String): F[String]

  /**
   * Validate that the string is empty.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param string String to test
   */
  def isEmpty(string: String): F[String]

  /**
   * Validate that the string is longer than.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param regex  Regular  expression to test.
   * @param string String to test
   */
  def isMatchingRegex(regex: Regex)(string: String): F[String]

}
