package org.mastermold.platform.infrastructure.execution

final case class ProcessorCount(value: ProcessorCount.Repr) extends AnyVal

object ProcessorCount {

  type Repr = Int

}
