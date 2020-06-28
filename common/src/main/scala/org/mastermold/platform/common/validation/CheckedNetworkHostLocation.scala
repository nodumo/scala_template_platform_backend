package org.mastermold.platform.common.validation

/**
 * Host location.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param value Value
 */
final case class CheckedNetworkHostLocation private[validation] (value: CheckedNetworkHostLocation.Repr) extends AnyVal

object CheckedNetworkHostLocation {

  type Repr = String

}
