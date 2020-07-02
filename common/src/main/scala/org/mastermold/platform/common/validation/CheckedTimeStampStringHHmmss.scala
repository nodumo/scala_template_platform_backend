package org.mastermold.platform.common.validation

/**
 * Checked timestamp string.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @param value Value
 */
final case class CheckedTimeStampStringHHmmss private[validation] (value: CheckedTimeStampStringHHmmss.Repr)
    extends AnyVal

object CheckedTimeStampStringHHmmss {

  type Repr = String

  val reprFormat: String = "dd/MMMM/yyyy hh:mm:s zzzz"

}
