package org.mastermold.platform.infrastructure.http

/**
 * Header value.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @param value Value
 */
final case class HeaderValue(value: HeaderValue.Repr) extends AnyVal

object HeaderValue {

  type Repr = String

}
