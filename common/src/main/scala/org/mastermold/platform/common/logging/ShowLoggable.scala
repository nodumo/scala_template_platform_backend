package org.mastermold.platform.common.logging

import cats.Show
import scala.language.reflectiveCalls
import shapeless._

/**
 * Show loggable string.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam A Value to safe log entry
 */
trait ShowLoggable[A] {

  def show(a: A): SafeLogString

}

object ShowLoggable {

  def apply[A](showLoggable: ShowLoggable[A]): ShowLoggable[A] =
    showLoggable

  def createInstanceFromFunctionToRepr[A](f: A => String): ShowLoggable[A] =
    createInstanceFromFunctionToSafeLogString(x => SafeLogString(f(x)))

  def createInstanceFromFunctionToSafeLogString[A](f: A => SafeLogString): ShowLoggable[A] =
    new ShowLoggable[A] {
      override def show(a: A): SafeLogString = f(a)
    }

  def createFromCatsShow[A](implicit show: Show[A]): ShowLoggable[A] =
    createInstanceFromFunctionToSafeLogString(x => SafeLogString(show.show(x)))

  implicit def instanceValueWrapper[A, B <: { val value: A }](implicit showLoggable: ShowLoggable[A]): ShowLoggable[B] =
    createInstanceFromFunctionToSafeLogString(x => showLoggable.show(x.value))

  implicit def deriveHNil: ShowLoggable[HNil] =
    new ShowLoggable[HNil] {
      override def show(a: HNil): SafeLogString = SafeLogString("")
    }

  implicit def instanceByte(implicit show: Show[Byte]): ShowLoggable[Byte] =
    createFromCatsShow

  implicit def instanceFloat(implicit show: Show[Float]): ShowLoggable[Float] =
    createFromCatsShow

  implicit def instanceInt(implicit show: Show[Int]): ShowLoggable[Int] =
    createFromCatsShow

  implicit def instanceLong(implicit show: Show[Long]): ShowLoggable[Long] =
    createFromCatsShow

  implicit def instanceString(implicit show: Show[String]): ShowLoggable[String] =
    createFromCatsShow

  implicit def instanceUnit(implicit show: Show[Unit]): ShowLoggable[Unit] =
    createFromCatsShow
}
