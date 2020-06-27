package org.mastermold.platform.infrastructure.repositiories.doobie

import doobie.implicits._
import doobie.util.fragment.Fragment
import org.mastermold.platform.common.typelevel.CaseClassKeys
import org.mastermold.platform.domain.definitions.DomainAggregate

/**
 * Get column list for the aggregate object.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam Aggregate Aggregate column list
 */
trait GenAggregateColumnList[Aggregate <: DomainAggregate[_]] {

  def columns: Fragment

}

object GenAggregateColumnList {

  implicit def apply[Aggregate <: DomainAggregate[_]](
      implicit attributes: CaseClassKeys[Aggregate]): GenAggregateColumnList[Aggregate] =
    new GenAggregateColumnList[Aggregate] {
      override def columns: Fragment = fr" ${attributes.fieldNames.mkString(",")} "
    }

}
