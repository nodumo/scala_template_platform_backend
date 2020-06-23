package org.mastermold.platform.infrastructure.logging

/**
 * Logging adapter algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam Message Value to output
 */
trait LoggingUnsafeAdapterAlgebra[Message] {

  /**
   * Log with a level of Debug.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param message Message to output
   */
  def debug(message: Message): Unit

  /**
   * Log with a level of Info.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param message Message to output
   */
  def info(message: Message): Unit

  /**
   * Log with a level of Warn.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param message Message to output
   */
  def warn(message: Message): Unit

  /**
   * Log with a level of Danger.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param message Message to output
   */
  def danger(message: Message): Unit

}
