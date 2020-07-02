package org.mastermold.platform.common.validation

/**
 * Host location.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @param value Value
 */
final case class CheckedNetworkHostPort private[validation] (value: CheckedNetworkHostPort.Repr) extends AnyVal

object CheckedNetworkHostPort {

  type Repr = String

}
