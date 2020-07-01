package org.mastermold.platform.common.predicates.interpreters

import org.mastermold.platform.common.predicates.StringPredicatesAlgebra
import scala.util.matching.Regex

class StringPredicatesInterpreter extends StringPredicatesAlgebra{

  override def isContentsEqual(valueLeft: String, valueRight: String): Boolean =
    valueLeft.contentEquals(valueRight)

  override def isContentsDifferent(valueLeft: String, valueRight: String): Boolean =
    !isContentsEqual(valueLeft, valueRight)

  override def isLengthEmpty(value: String): Boolean =
    intPredicate.isGreaterThanOrEqualTo(value.length, 0)

  override def isLengthGreaterThan(value: String, length: Int): Boolean =
    intPredicate.isGreaterThan(value.length, length)

  override def isLengthEqualTo(value: String, length: Int): Boolean =
    intPredicate.isGreaterThanOrEqualTo(value.length, length)

  override def isLengthShorterThan(value: String, length: Int): Boolean =
    intPredicate.isLessThan(value.length, length)

  override def isSetContentContain(value: String, setOfAcceptableValues: Set[String]): Boolean =
    setOfAcceptableValues.apply(value)

  override def isSetContentLacking(value: String, setOfAcceptableValues: Set[String]): Boolean =
    !isSetContentContain(value, setOfAcceptableValues)

  override def isMatchRegex(value: String, regex: Regex): Boolean =
    true

}
