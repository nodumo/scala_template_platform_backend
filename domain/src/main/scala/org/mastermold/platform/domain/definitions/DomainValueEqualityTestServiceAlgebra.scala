package org.mastermold.platform.domain.definitions

trait DomainValueEqualityTestServiceAlgebra[V <: DomainValue] {

  def equalValue(leftA: V, rightA: V)(implicit eqDomainValue: EqDomainValue[V]): Boolean

}
