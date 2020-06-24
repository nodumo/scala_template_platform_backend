package org.mastermold.platform.application.definitions

/**
 * Application result.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param result Result
 */
final case class TransactionResult[Result](result: Result) extends AnyVal
