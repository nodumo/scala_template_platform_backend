package org.mastermold.platform.infrastructure.repositiories.doobie.interpreters

import doobie.implicits._
import doobie.util.fragment.Fragment
import org.mastermold.platform.domain.definitions.{DomainAggregate, DomainValue}
import org.mastermold.platform.infrastructure.repositiories.doobie.AggregateGenColumnList

/**
  * Base doobie aggregate
  *
  * @author Nick Odumo (nodumo@nodumo.com)
  * @see Postgress docs. Be mindful of full SQL scans:
  *      https://www.postgresql.org/docs/9.1/rules-update.html
  * @tparam V Domain values
  * @tparam A Domain aggregate
  */
abstract class BaseDoobieRepositoryInterpreter[V <: DomainValue, A[_] <: DomainAggregate[V]](aggregateGenColumnList: AggregateGenColumnList[A]){

  val tableName: Fragment

  private val tableNameFragment = tableName
  val selectAllColumnsClause: Fragment =
      fr"SELECT " ++ aggregateGenColumnList.columns ++ tableNameFragment

  val insertIntoColumnClause: Fragment =
    fr"INSERT INTO (" ++ aggregateGenColumnList.columns ++ fr")" ++ tableNameFragment

  val updateColumnClause: Fragment =
    fr"UPDATE " ++ tableNameFragment ++ fr" SET "

}

