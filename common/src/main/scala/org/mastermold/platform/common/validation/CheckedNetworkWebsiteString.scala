package org.mastermold.platform.common.validation

/**
 * Checked network website string.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param value Value
 */
final case class CheckedNetworkWebsiteString private[validation] (value: CheckedNetworkWebsiteString.Repr)
    extends AnyVal

object CheckedNetworkWebsiteString {

  type Repr = String

}
