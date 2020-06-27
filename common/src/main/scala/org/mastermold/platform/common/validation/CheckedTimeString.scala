package org.mastermold.platform.common.validation

/**
 * Checked time string.
 *
 * "The TIMETZ data type stores a time of day with a time zone offset from UTC." - cockroachlabs
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @see https://www.postgresqltutorial.com/postgresql-time/
 *      https://docs.yugabyte.com/v1.2/api/ysql/datatypes/type_datetime/
 * @param value Value
 */
final case class CheckedTimeString private[validation] (value: CheckedTimeString.Repr) extends AnyVal

object CheckedTimeString {

  type Repr = String

}
