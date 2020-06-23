package org.mastermold.platform.common.validation

/**
 * Checked date-string YYYYMMDDHHMISS string.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @example {{{
 *  val dateString = this.apply("2011-08-11 12:00:00")
 * }}}
 * @param value Value
 */
final case class CheckedDateTimeStringYYYYMMDDHHMISS private[validation] (
    value: CheckedDateTimeStringYYYYMMDDHHMISS.Repr)
    extends AnyVal

object CheckedDateTimeStringYYYYMMDDHHMISS {

  type Repr = String

}
