package org.mastermold.platform.common.validation

/**
 * JDBC Driver Connection URL.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @param value Value
 */
final case class CheckedNetworkJavaJDBCUrlString private[validation] (value: CheckedNetworkJavaJDBCUrlString.Repr)
    extends AnyVal

object CheckedNetworkJavaJDBCUrlString {

  type Repr = String

}
