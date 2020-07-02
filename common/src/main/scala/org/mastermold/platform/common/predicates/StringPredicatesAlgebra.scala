package org.mastermold.platform.common.predicates

import scala.util.matching.Regex

/**
 * String predicates algebra.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @see https://landau.github.io/predicate
 */
trait StringPredicatesAlgebra {

  // --- Equality

  /**
   * Check if strings contents are not equal.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param valueLeft  Value left
   * @param valueRight Value right
   */
  def isContentsEqual(valueLeft: String, valueRight: String): Boolean

  /**
   * Check if strings contents are equal.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param valueLeft  Value left
   * @param valueRight Value right
   */
  def isContentsDifferent(valueLeft: String, valueRight: String): Boolean

  // --- Length comparisons

  /**
   * Check if strings contents are equal.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param value Value
   */
  def isLengthEmpty(value: String): Boolean

  /**
   * Check if strings length equal to.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param value Value left
   * @param length     Length to compare to
   */
  def isLengthEqualTo(value: String, length: Int): Boolean

  /**
   * Check if string length greater than.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param value   Value
   * @param length     Length to compare to
   */
  def isLengthGreaterThan(value: String, length: Int): Boolean

  /**
   * Check if string length shorter than.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param value Value 
   * @param length Length to compare to
   */
  def isLengthShorterThan(value: String, length: Int): Boolean

  // --- Found in set

  /**
   * Check if string is not found in defined set.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param value                String
   * @param setOfAcceptableValues Set acceptable values
   */
  def isSetContentContain(value: String, setOfAcceptableValues: Set[String]): Boolean

  /**
   * Check if string is found in defined set.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param value                String
   * @param setOfAcceptableValues Set acceptable values
   */
  def isSetContentLacking(value: String, setOfAcceptableValues: Set[String]): Boolean

  // --- Utilities 

  /**
   * Check if string matches regex.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param value                String
   * @param regex  Regex to test
   */
  def isMatchRegex(value: String, regex: Regex): Boolean

}
