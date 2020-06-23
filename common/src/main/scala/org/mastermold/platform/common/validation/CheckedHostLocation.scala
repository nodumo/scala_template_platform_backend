package org.mastermold.platform.common.validation

/**
 * Host location.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param value Value
 */
final case class CheckedHostLocation private[validation] (value: CheckedHostLocation.Repr) extends AnyVal

object CheckedHostLocation {

  type Repr = String

}
