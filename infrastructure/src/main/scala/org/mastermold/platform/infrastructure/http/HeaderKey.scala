package org.mastermold.platform.infrastructure.http

/**
 * Header key.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @param value Value
 */
final case class HeaderKey(value: HeaderKey.Repr) extends AnyVal

object HeaderKey {

  type Repr = String

  val authHeader: HeaderKey = HeaderKey("Authorization")

}
