package org.mastermold.platform.infrastructure.repositiories.doobie.interpreters

import doobie.implicits._
import doobie.util.fragment.Fragment
import org.mastermold.platform.domain.definitions.{ DomainAggregate, DomainValue }
import org.mastermold.platform.infrastructure.repositiories.doobie.AggregateGenColumnList

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
    implicit aggregateGenColumnList: AggregateGenColumnList[A[V]])
    extends WhereClauseMixinPostgresFragmentInterpreter {

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


   /**
 * Generate assoc clause for update statement.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam Column Column type
 * @param columnNameOption Optional column name
 */
   protected def toInsertTuple[Column](columnNameOption: Option[ColumnName]): Fragment =
     fr" (" ++ fr") "

   /**
 * Generate assoc clause for update statement.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam Column Column type
 * @param columnNameOption Optional column name
 */
   protected def toUpdateAssoc[Column](columnNameOption: Option[ColumnName]): Fragment =
     fr" (" ++ fr") "
 */
}
