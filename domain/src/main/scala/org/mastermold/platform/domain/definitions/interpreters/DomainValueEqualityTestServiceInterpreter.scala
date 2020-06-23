package org.mastermold.platform.domain.definitions.interpreters

import org.mastermold.platform.domain.definitions.{ DomainValue, DomainValueEqualityTestServiceAlgebra, EqDomainValue }

class DomainValueEqualityTestServiceInterpreter[V <: DomainValue] extends DomainValueEqualityTestServiceAlgebra[V] {

  override def equalValue(leftA: V, rightA: V)(implicit eqDomainValue: EqDomainValue[V]): Boolean =
    eqDomainValue.equal(leftA, rightA)

}
