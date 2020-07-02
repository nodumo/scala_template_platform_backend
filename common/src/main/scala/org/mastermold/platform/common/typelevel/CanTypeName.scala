package org.mastermold.platform.common.typelevel

import scala.reflect.ClassTag

/**
 * Get type-name for a particular type.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam T Type of sorts
 */
trait CanTypeName[T] {

  def getName: String

}

object CanTypeName {

  implicit def canClassTypeName[T: ClassTag]: CanTypeName[T] = new CanTypeName[T] {
    override def getName: String = scala.reflect.classTag[T].runtimeClass.getTypeName
  }

  def apply[T](implicit typeName: CanTypeName[T]): CanTypeName[T] = typeName

}
