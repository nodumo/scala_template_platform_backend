package org.mastermold.platform.application.definitions

import org.mastermold.platform.common.logging.ShowLoggable

/**
 * Flow id for the for the application transaction.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param value Value
 */
final case class FlowId(value: FlowId.Repr) extends AnyVal

object FlowId {

  type Repr = String

  implicit def showLoggable: ShowLoggable[FlowId] =
    ShowLoggable.createInstanceFromFunctionToRepr(_.value)

}
