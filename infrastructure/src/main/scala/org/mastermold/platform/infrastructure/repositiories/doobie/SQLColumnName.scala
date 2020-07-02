package org.mastermold.platform.infrastructure.repositiories.doobie

/**
 * SQL column name.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @param value Value
 */
final case class SQLColumnName(value: SQLColumnName.Repr) extends AnyVal

object SQLColumnName {

  type Repr = String

}
