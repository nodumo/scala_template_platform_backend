package org.mastermold.platform.common.predicates.interpreters

import org.mastermold.platform.common.predicates.NumericPredicatesAlgebra

class NumericPredicatesInterpreter[N: Numeric] extends NumericPredicatesAlgebra[N]{

  implicit val numeric: Numeric[N] = implicitly[Numeric[N]]

  override def isGreaterThan(valueLeft: N, valueRight: N): Boolean =
    numeric.gt(valueLeft, valueRight)

  override def isGreaterThanOrEqualTo(valueLeft: N, valueRight: N): Boolean =
    numeric.gteq(valueLeft, valueRight)

  override def isEqualTo(valueLeft: N, valueRight: N): Boolean=
    numeric.eq(valueLeft, valueRight)

  override def isLessThan(valueLeft: N, valueRight: N): Boolean=
    numeric.lt(valueLeft, valueRight)

  override def isLessThanOrEqualTo(valueLeft: N, valueRight: N): Boolean =
    numeric.lteq(valueLeft, valueRight)

}
