package org.mastermold.platform.common.validation

/**
 * Checked date-string YYYYMMDD string.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @example {{{
 *  val dateString = "2011-08-11"
 * }}}
 * @param value Value
 */
final case class CheckedDateStringYYYYMMDD private[validation] (value: CheckedDateStringYYYYMMDD.Repr) extends AnyVal

object CheckedDateStringYYYYMMDD {

  type Repr = String

}
