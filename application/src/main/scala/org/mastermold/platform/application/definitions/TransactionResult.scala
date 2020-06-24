package org.mastermold.platform.application.definitions

/**
 * Application payload.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param payload Payload
 */
final case class TransactionResult[Payload](payload: Payload) extends AnyVal
