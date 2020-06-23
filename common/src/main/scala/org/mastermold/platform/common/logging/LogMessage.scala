package org.mastermold.platform.common.logging

import cats.{ Order, Show }

sealed abstract class LogMessage(val level: Int) {

  val safeLogString: SafeLogString

}

object LogMessage {

  final case class Debug(safeLogString: SafeLogString) extends LogMessage(0)

  final case class Info(safeLogString: SafeLogString) extends LogMessage(1)

  final case class Warn(safeLogString: SafeLogString) extends LogMessage(2)

  final case class Danger(safeLogString: SafeLogString) extends LogMessage(3)

  final case class Critical(safeLogString: SafeLogString) extends LogMessage(4)

  implicit val instanceOrd: Order[LogMessage] =
    new Order[LogMessage] {
      override def compare(x: LogMessage, y: LogMessage): Int = x.level - y.level
    }

  implicit def instanceShow(implicit showC: Show[SafeLogString]): Show[LogMessage] =
    new Show[LogMessage] {
      override def show(t: LogMessage): String = showC.show(t.safeLogString)
    }

}
