package org.mastermold.platform.common.validation

/**
 * Host location.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @param value Value
 */
final case class CheckedNetworkHostLocation private[validation] (value: CheckedNetworkHostLocation.Repr) extends AnyVal

object CheckedNetworkHostLocation {

  type Repr = String

}
