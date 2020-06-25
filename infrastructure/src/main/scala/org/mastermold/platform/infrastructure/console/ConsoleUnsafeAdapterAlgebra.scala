package org.mastermold.platform.infrastructure.console

/**
 * Console unsafe adapter algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @usecase Interacting with the Java console
 * @tparam Message Value to output
 */
trait ConsoleUnsafeAdapterAlgebra[Message] {

  /**
   * Console print line.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param message Message to output
   */
  def printLine(message: Message): Unit

}
