package org.mastermold.platform.common.validation

/**
 * JDBC Driver Connection URL.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param value Value
 */
final case class CheckedJavaJDBCUrlString private[validation] (value: CheckedJavaJDBCUrlString.Repr) extends AnyVal

object CheckedJavaJDBCUrlString {

  type Repr = String

}
