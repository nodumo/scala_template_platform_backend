package org.mastermold.platform.common.predicates

package object interpreters {

  object intPredicate extends NumericPredicatesInterpreter[Int]

  object longPredicate extends NumericPredicatesInterpreter[Long]

  object stringPredicate extends StringPredicatesInterpreter

}
