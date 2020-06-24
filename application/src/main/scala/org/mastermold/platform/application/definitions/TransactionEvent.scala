package org.mastermold.platform.application.definitions

import org.mastermold.platform.common.logging.ShowLoggable

/**
 * Application event.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam Payload Payload to handle with the application
 * @tparam Context Application context
 */
sealed abstract class TransactionEvent[Payload, Context] {

  val payload: Payload

  val context: Context

}

object TransactionEvent {

  /**
   * Application command.
   *
   * "A command tells our application to do something.
   *  Its name always uses the indicative tense, like TerminateBusiness or
   *  SendForgottenPasswordEmail. It’s very important not to confine
   *  these names to create, change, delete… and to really focus on the use
   *  cases (see CQRS Documents at the end of this document for more
   *  information)." - Romain Pierlot
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @see https://medium.com/eleven-labs/cqrs-pattern-c1d6f8517314
   * @param payload Payload to handle with the application
   * @param context Application context
   */
  final case class ApplicationCommand[Payload, Context] private[definitions](payload: Payload, context: Context)
      extends TransactionEvent[Payload, Context]

  /**
   * Application query.
   *
   * "Using different data stores in our application for the
   * command and query parts seems to be a very interesting idea.
   * As Udi Dahan explains very well in his article Clarified CQRS, we could
   * create a user interface oriented database, which would reflect what we need to
   * display to our user. We would gain in both performance and speed.
   * Dissociating our data stores (one for the modification of data and one for
   * reading) does not imply the use of relational databases for both of them for instance.
   * Therefore, it would be more thoughtful to use a database that can read our
   * queries fastly."  - Romain Pierlot
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @see https://medium.com/eleven-labs/cqrs-pattern-c1d6f8517314
   * @param payload Payload to handle with the application
   * @param context Application context
   */
  final case class ApplicationQuery[Payload, Context] private[definitions](payload: Payload, context: Context)
      extends TransactionEvent[Payload, Context]

  implicit def showLoggable[Payload, Context](
      showLoggablePayload: ShowLoggable[Payload],
      showLoggablePayloadContext: ShowLoggable[Context]): ShowLoggable[TransactionEvent[Payload, Context]] =
    ShowLoggable.createInstanceFromFunctionToRepr(event => {
      s""" ApplicationEvent {
         |   payload: ${showLoggablePayload.show(event.payload)}
         |   context: ${showLoggablePayloadContext.show(event.context)}
         | }
   """.stripMargin
    })

}
