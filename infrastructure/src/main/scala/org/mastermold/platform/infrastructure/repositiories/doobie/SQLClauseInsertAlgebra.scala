package org.mastermold.platform.infrastructure.repositiories.doobie

/**
 * SQL insert clause.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam ColumnName Column name
 * @tparam Fragment Fragment
 */
trait SQLClauseInsertAlgebra[ColumnName, Fragment] {

  /**
   * Generate insert clause for a given type.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @tparam Column Column type
   * @param columnNameOption Optional column name
   */
  protected def toInsertTuple[Column](columnNameOption: Option[ColumnName]): Fragment

  /**
   * Generate update clause for a given type.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @tparam Column Column type
   * @param columnNameOption Optional column name
   */
  protected def toUpdateAssoc[Column](columnNameOption: Option[ColumnName]): Fragment

}
