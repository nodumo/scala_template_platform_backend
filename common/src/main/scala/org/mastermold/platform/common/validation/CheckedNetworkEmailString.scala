package org.mastermold.platform.common.validation

/**
 * Checked network email string.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param value Value
 */
final case class CheckedNetworkEmailString private[validation] (value: CheckedNetworkEmailString.Repr) extends AnyVal

object CheckedNetworkEmailString {

  type Repr = String

}
