package org.mastermold.platform.infrastructure.http

/**
 * Header value.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param value Value
 */
final case class HeaderValue(value: HeaderValue.Repr) extends AnyVal

object HeaderValue {

  type Repr = String

}
