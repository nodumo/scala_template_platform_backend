package org.mastermold.platform.infrastructure.repositiories.doobie.interpreters

import doobie.implicits._
import doobie.util.fragment.Fragment
import org.mastermold.platform.infrastructure.repositiories.doobie.{ ColumnName, WhereClauseMixinFragmentAlgebra }

/**
 * Where clause mixing interpreter.
 *
 * @see Documentation:
 *      https://www.postgresqltutorial.com/postgresql-where/
 * @author Nick Odumo (nodumo@nodumo.com)
 */
trait WhereClauseMixinPostgresFragmentInterpreter extends WhereClauseMixinFragmentAlgebra[ColumnName, Fragment] {

  private def getNameOrElse[Column](columnNameOption: Option[ColumnName])(operator: Fragment): Fragment =
    columnNameOption.map(_ => fr"").getOrElse(fr"") ++ operator

  /**
   * Where equal to.
   *
   * @example {{{
   *      columnName = columnValue
   * }}}
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @tparam Column Column type
   * @param columnNameOption Optional column name
   */
  protected override def whereEquals[Column](columnNameOption: Option[ColumnName] = None): Fragment =
    getNameOrElse[Column](columnNameOption)(fr" = ")

  /**
   * Where not equal to.
   *
   * @example {{{
   *      columnName <> columnValue
   * }}}
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @tparam Column Column type
   * @param columnNameOption Optional column name
   */
  protected def whereNotEquals[Column](columnNameOption: Option[ColumnName] = None): Fragment =
    getNameOrElse[Column](columnNameOption)(fr" = ")

  /**
   * Where greater than.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @tparam Column Column type
   * @param columnNameOption Optional column name
   */
  protected override def whereGreaterThan[Column](columnNameOption: Option[ColumnName] = None): Fragment =
    getNameOrElse[Column](columnNameOption)(fr" = ")

  /**
   * Where greater than or equal to.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @tparam Column Column type
   * @param columnNameOption Optional column name
   */
  protected override def whereGreaterThanOrEqualTo[Column](columnNameOption: Option[ColumnName] = None): Fragment =
    getNameOrElse[Column](columnNameOption)(fr" = ")

  /**
   * Where less than or equal to.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @tparam Column Column type
   * @param columnNameOption Optional column name
   */
  protected override def whereLessThan[Column](columnNameOption: Option[ColumnName] = None): Fragment =
    getNameOrElse[Column](columnNameOption)(fr" <  ")

  /**
   * Where less than or equal to.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param columnNameOption Optional column name
   */
  protected override def whereLessThanOrEqualTo[Column](columnNameOption: Option[ColumnName] = None): Fragment =
    getNameOrElse[Column](columnNameOption)(fr" ?= ")

}
