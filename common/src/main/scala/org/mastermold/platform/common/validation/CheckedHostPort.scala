package org.mastermold.platform.common.validation

/**
 * Host location.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param value Value
 */
final case class CheckedHostPort private[validation] (value: CheckedHostPort.Repr) extends AnyVal

object CheckedHostPort {

  type Repr = String

}
