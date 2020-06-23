package org.mastermold.platform.infrastructure.console

/**
  * Console service algebra.
  *
  * @author Nick Odumo (nodumo@nodumo.com)
  * @tparam F Effect
  * @tparam Message Value to output
  */
trait ConsoleServiceAlgebra [F[_], Message] {

  /**
    * Console print line.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @param message Message to output
    */
  def printLine(message: Message): F[Unit]

}
