package org.mastermold.platform.infrastructure.http

/**
 * Header key.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param value Value
 */
final case class HeaderKey(value: HeaderKey.Repr) extends AnyVal

object HeaderKey {

  type Repr = String

  val authHeader: HeaderKey = HeaderKey("Authorization")

}
