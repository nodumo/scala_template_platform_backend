package org.mastermold.platform.common.predicates

import scala.util.matching.Regex

/**
 * String predicates algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @see https://landau.github.io/predicate
 */
trait StringPredicatesAlgebra {

  // --- Equality

  /**
   * Check if strings contents are not equal.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param valueLeft  Value left
   * @param valueRight Value right
   */
  def isContentsEqual(valueLeft: String, valueRight: String): Boolean

  /**
   * Check if strings contents are equal.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param valueLeft  Value left
   * @param valueRight Value right
   */
  def isContentsDifferent(valueLeft: String, valueRight: String): Boolean

  // --- Length comparisons

  /**
   * Check if strings contents are equal.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param valueLeft Value 
   */
  def isLengthEmpty(value: String): Boolean

  /**
   * Check if strings length equal to.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param value Value left
   * @param length     Length to compare to
   */
  def isLengthEqualTo(value: String, length: Int): Boolean

  /**
   * Check if string length greater than.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param value   Value
   * @param length     Length to compare to
   */
  def isLengthGreaterThan(value: String, length: Int): Boolean

  /**
   * Check if string length shorter than.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param value Value 
   * @param length Length to compare to
   */
  def isLengthShorterThan(value: String, length: Int): Boolean

  // --- Found in set

  /**
   * Check if string is not found in defined set.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param value                String
   * @param setOfAcceptableValues Set acceptable values
   */
  def isSetContentContain(value: String, setOfAcceptableValues: Set[String]): Boolean

  /**
   * Check if string is found in defined set.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param value                String
   * @param setOfAcceptableValues Set acceptable values
   */
  def isSetContentLacking(value: String, setOfAcceptableValues: Set[String]): Boolean

  // --- Utilities 

  /**
   * Check if string matches regex.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param value                String
   * @param regex  Regex to test
   */
  def isMatchRegex(value: String, regex: Regex): Boolean

}
