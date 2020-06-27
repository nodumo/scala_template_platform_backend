package org.mastermold.platform.common.validation

/**
 * Checked network website string.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param value Value
 */
final case class CheckedNetworkWebsite private[validation](value: CheckedNetworkWebsite.Repr)
    extends AnyVal

object CheckedNetworkWebsite {

  type Repr = String

}
