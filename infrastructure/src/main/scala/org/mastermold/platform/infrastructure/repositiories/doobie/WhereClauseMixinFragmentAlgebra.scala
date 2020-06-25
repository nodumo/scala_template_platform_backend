package org.mastermold.platform.infrastructure.repositiories.doobie

/**
 * Where clause mixing query algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com
 * @tparam NameOfColumn Name of the column
 * @tparam QueryFragment Query fragment
 */
trait WhereClauseMixinFragmentAlgebra[NameOfColumn, QueryFragment] {

  // --- Where: Equality check

  /**
   * Where equal to.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @tparam Column Column type
   * @param columnNameOption Optional column name
   */
  protected def whereEquals[Column](columnNameOption: Option[NameOfColumn] = None): QueryFragment

  /**
   * Where not equal to.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @tparam Column Column type
   * @param columnNameOption Optional column name
   */
  protected def whereNotEquals[Column](columnNameOption: Option[NameOfColumn] = None): QueryFragment

  // --- Where: Magnitude

  /**
   * Where greater than.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @tparam Column Column type
   * @param columnNameOption Optional column name
   */
  protected def whereGreaterThan[Column](columnNameOption: Option[NameOfColumn] = None): QueryFragment

  /**
   * Where greater than or equal to.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @tparam Column Column type
   * @param columnNameOption Optional column name
   */
  protected def whereGreaterThanOrEqualTo[Column](columnNameOption: Option[NameOfColumn] = None): QueryFragment

  /**
   * Where less than or equal to.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @tparam Column Column type
   * @param columnNameOption Optional column name
   */
  protected def whereLessThan[Column](columnNameOption: Option[NameOfColumn] = None): QueryFragment

  /**
   * Where less than or equal to.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param columnNameOption Optional column name
   */
  protected def whereLessThanOrEqualTo[Column](columnNameOption: Option[NameOfColumn] = None): QueryFragment

}
