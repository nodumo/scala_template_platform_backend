package org.mastermold.platform.infrastructure.repositiories.doobie.interpreters

import doobie.implicits._
import doobie.util.fragment.Fragment
import org.mastermold.platform.domain.definitions.{ DomainAggregate, DomainValue }
import org.mastermold.platform.infrastructure.repositiories.doobie.GenAggregateColumnList

/**
 * Base doobie aggregate repository.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @see Postgres docs. Be mindful of full SQL scans:
 *      https://www.postgresql.org/docs/9.1/rules-update.html
 * @tparam V Domain values
 * @tparam A Domain aggregate
 */
abstract class BaseDoobieRepositoryInterpreter[V <: DomainValue, A[_] <: DomainAggregate[V]](
    implicit aggregateGenColumnList: GenAggregateColumnList[A[V]])
    extends SQLClauseWhereInterpreter {

  protected val tableName: Fragment

  // --- Query fragment

  protected val tableNameFragment: Fragment = tableName

  protected val selectAllColumnsClause: Fragment =
  fr"SELECT " ++ aggregateGenColumnList.columns ++ tableNameFragment
  /*
   protected val insertIntoColumnClause: Fragment = ???
   // fr"INSERT INTO (" ++ aggregateGenColumnList.columns ++ fr") " ++ tableNameFragment

   protected val updateColumnSetClause: Fragment =
   fr"UPDATE " ++ tableNameFragment ++ fr" SET "

   // --- Structured clause
 */

}
