package org.mastermold.platform.common.calculate

/**
  * Numeric calculations algebra.
  *
  * @author Nick Odumo (nodumo@nodumo.com)
  * @tparam N Numeric type
  */
trait NumericCalculationsAlgebra[N] {

  def incrementBy(original: N, toAdd: N): N

  def incrementByOne(original: N, toAdd: N): N

  def decrementBy(original: N, toAdd: N): N

  def decrementByOne(original: N, toAdd: N): N

  def incrementByOneFloorZero(original: N, toAdd: N): N

}
