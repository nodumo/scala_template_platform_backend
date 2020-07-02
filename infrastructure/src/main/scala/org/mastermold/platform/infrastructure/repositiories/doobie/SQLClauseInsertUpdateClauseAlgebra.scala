package org.mastermold.platform.infrastructure.repositiories.doobie

/**
 * SQL insert clause.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam Entity Entity
 * @tparam SQLFragment SQL fragment
 */
trait SQLClauseInsertUpdateClauseAlgebra[Entity, SQLFragment] {

  /**
   * Generate insert clause for a given type.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param entity Entity to persist
   */
  protected def toInsertTuple(entity: Entity): SQLFragment

  /**
   * Generate update clause for a given type.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param entity Entity to persist
   */
  protected def toUpdateAssoc(entity: Entity): SQLFragment

}
