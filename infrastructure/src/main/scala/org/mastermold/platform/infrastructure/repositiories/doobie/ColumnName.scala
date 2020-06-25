package org.mastermold.platform.infrastructure.repositiories.doobie

final case class ColumnName(name: ColumnName.Repr) extends AnyVal

object ColumnName {

  type Repr = String

}
