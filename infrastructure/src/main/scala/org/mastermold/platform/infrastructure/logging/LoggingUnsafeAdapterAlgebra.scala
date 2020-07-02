package org.mastermold.platform.infrastructure.logging

/**
 * Logging adapter algebra.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam Message Value to output
 */
trait LoggingUnsafeAdapterAlgebra[Message] {

  /**
   * Log with a level of Debug.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param message Message to output
   */
  def debug(message: Message): Unit

  /**
   * Log with a level of Info.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param message Message to output
   */
  def info(message: Message): Unit

  /**
   * Log with a level of Warn.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param message Message to output
   */
  def warn(message: Message): Unit

  /**
   * Log with a level of Danger.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param message Message to output
   */
  def danger(message: Message): Unit

}
