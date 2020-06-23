package org.mastermold.platform.domain.definitions.interpreters

import org.mastermold.platform.domain.definitions.{
  DomainAggregate,
  DomainEqualityTestServiceAlgebra,
  DomainValue,
  EqDomainAggregate
}

class DomainEqualityTestServiceGenericInterpreter[V <: DomainValue, A[_] <: DomainAggregate[V]]
    extends DomainEqualityTestServiceAlgebra[V, A] {

  override def equalAggregate(leftA: A[V], rightA: A[V])(eqDomainAggregate: EqDomainAggregate[V, A]): Boolean =
    eqDomainAggregate.equal(leftA, rightA)

}
