package org.mastermold.platform.common.validation

/**
 * Checked date-string YYYYMMDDHHMISS string.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @param value Value
 */
final case class CheckedDateTimeStringYYYYMMDDHHMISS private[validation] (
    value: CheckedDateTimeStringYYYYMMDDHHMISS.Repr)
    extends AnyVal

object CheckedDateTimeStringYYYYMMDDHHMISS {

  type Repr = String

}
