package org.mastermold.platform.infrastructure.nashorn

final case class DelightResult(result: DelightResult.Repr, outputLog: String)

object DelightResult {

  type Repr = Any

}
