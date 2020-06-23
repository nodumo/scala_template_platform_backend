package org.mastermold.platform.common.validation

/**
 * Checked 9 digit number string.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param value Value
 */
final case class Checked9DigitNumber private[validation] (value: Checked9DigitNumber.Repr) extends AnyVal

object Checked9DigitNumber {

  type Repr = String

}
