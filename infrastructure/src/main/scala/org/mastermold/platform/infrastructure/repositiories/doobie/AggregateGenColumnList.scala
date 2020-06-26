package org.mastermold.platform.infrastructure.repositiories.doobie

import doobie.implicits._
import doobie.util.fragment.Fragment
import org.mastermold.platform.common.typelevel.CaseClassKeys

/**
 * Get column list for the aggregate object.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam Aggregate Aggregate column list
 */
trait AggregateGenColumnList[Aggregate] {

  def columns: Fragment

}

object AggregateGenColumnList {

  implicit def apply[C](implicit attributes: CaseClassKeys[C]): AggregateGenColumnList[C] =
    new AggregateGenColumnList[C] {
      override def columns: Fragment = fr"${attributes.fieldNames.mkString(",")}"
    }

}
