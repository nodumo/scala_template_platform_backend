package org.mastermold.platform.infrastructure.nashorn

/**
 * Script result.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 */
sealed trait ScriptResult

object ScriptResult {

  final case object Null extends ScriptResult

  final case class Number(string: String) extends ScriptResult

  final case class String(string: String) extends ScriptResult

  final case class Json(string: String) extends ScriptResult

}
