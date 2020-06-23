package org.mastermold.platform.domain.definitions

trait DomainEqualityTestServiceAlgebra[V <: DomainValue, A[_] <: DomainAggregate[V]] {

  def equalAggregate(leftA: A[V], rightA: A[V])(eqDomainAggregate: EqDomainAggregate[V, A]): Boolean

}
