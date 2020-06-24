package org.mastermold.platform.common.typelevel

import shapeless.ops.hlist.ToTraversable
import shapeless.ops.record.Keys
import shapeless.HList //import shapeless.{ HList, LabelledGeneric }

/**
 * To attributes of case class.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @see https://svejcar.dev/posts/2019/10/22/extracting-case-class-field-names-with-shapeless/
 * @tparam T Type of sorts
 */
trait CaseClassKeys[T] {

  def fieldNames: List[String]

}

object CaseClassKeys {

  implicit def toCaseClassKeys[T, Repr <: HList, KeysRepr <: HList](
      implicit //gen: LabelledGeneric.Aux[T, Repr],
      keys: Keys.Aux[Repr, KeysRepr],
      traversable: ToTraversable.Aux[KeysRepr, List, Symbol]
  ): CaseClassKeys[T] = new CaseClassKeys[T] {
    override def fieldNames: List[String] = keys().toList.map(_.name)
  }

  def apply[T](implicit attributes: CaseClassKeys[T]): CaseClassKeys[T] = attributes

}
