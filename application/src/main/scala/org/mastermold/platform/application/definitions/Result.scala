package org.mastermold.platform.application.definitions

/**
 * Application result.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam Payload Payload
 * @param payload Payload
 */
final case class Result[Payload](payload: Payload) extends AnyVal
