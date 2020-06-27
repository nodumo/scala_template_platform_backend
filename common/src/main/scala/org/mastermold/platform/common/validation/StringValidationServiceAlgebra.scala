package org.mastermold.platform.common.validation

/**
  * String length validation service algebra.
  *
  * @author Nick Odumo (nodumo@nodumo.com)
  * @tparam F      Effect
  * @tparam RegexT Regular expression representation
  */
trait StringValidationServiceAlgebra[F[_], RegexT] {

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
    * Validate that the string is longer than.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @param regex  Regular  expression to test.
    * @param string String to test
    */
  def isMatchingRegex(regex: RegexT)(string: String): F[String]

}
