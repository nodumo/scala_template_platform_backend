package org.mastermold.platform.infrastructure.console

/**
 * Console unsafe adapter algebra.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @usecase Interacting with the Java console
 * @tparam Message Value to output
 */
trait ConsoleUnsafeAdapterAlgebra[Message] {

  /**
   * Console print line.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param message Message to output
   */
  def printLine(message: Message): Unit

}
