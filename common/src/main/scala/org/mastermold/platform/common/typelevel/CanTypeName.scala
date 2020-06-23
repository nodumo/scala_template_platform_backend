package org.mastermold.platform.common.typelevel

/**
  * Get type-name for a particular type.
  *
  * @author Nick Odumo (nodumo@nodumo.com)
  * @tparam T Type of sorts
  */
trait CanTypeName[T] {

  def getName: String

}


object CanTypeName {

  implicit def canClassTypeName[A: ClassManifest]: CanTypeName[A] = new CanTypeName[A] {
    override def getName: String = classManifest[A].erasure.getName
  }

  def apply[T](implicit typeName: CanTypeName[T]): CanTypeName[T] = typeName

}