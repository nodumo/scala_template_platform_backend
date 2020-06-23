package org.mastermold.platform.common.logging

import cats.Show

final case class SafeLogString(value: SafeLogString.Repr) extends AnyVal

object SafeLogString {

  type Repr = String

  implicit val showInstance: Show[SafeLogString] = Show.show(_.value)

}
