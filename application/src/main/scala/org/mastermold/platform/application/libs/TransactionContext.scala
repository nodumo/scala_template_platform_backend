package org.mastermold.platform.application.libs

/**
 * Transaction context object for a given request.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param flowId Id of transaction
 */
final case class TransactionContext(flowId: FlowId)
