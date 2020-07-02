package org.mastermold.platform.infrastructure.console

/**
 * Console service algebra.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam F Effect
 * @tparam Message Value to output
 */
trait ConsoleServiceAlgebra[F[_], Message] {

  /**
   * Console print line.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param message Message to output
   */
  def printLine(message: Message): F[Unit]

}
