package org.mastermold.platform.application.definitions

/**
 * Application result.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam Payload Payload
 * @param payload Payload
 */
final case class Result[Payload](payload: Payload) extends AnyVal
