package org.mastermold.platform.common.validation

/**
 * Checked 7 digit number string.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param value Value
 */
final case class Checked7DigitNumber private[validation] (value: Checked7DigitNumber.Repr) extends AnyVal

object Checked7DigitNumber {

  type Repr = String

}
