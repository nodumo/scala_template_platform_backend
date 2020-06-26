package org.mastermold.platform.infrastructure.repositiories.doobie

/**
 * SQL column name.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param value Value
 */
final case class SQLColumnName(value: SQLColumnName.Repr) extends AnyVal

object SQLColumnName {

  type Repr = String

}
