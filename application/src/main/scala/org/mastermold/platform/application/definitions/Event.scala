package org.mastermold.platform.application.definitions

/**
  * Application event.
  *
  * @author Grumpy Cat (grumpycat@codekitt.com)
  * @usecase Modelling the application input
  * @tparam Content Content to process
  */
trait Event[Content] {

  val content: Content

  val flowId: FlowId

  // val dateTime: DateTime Joda implementation

}

object Event {

  /**
    * Command event.
    *
    * @author Grumpy Cat (grumpycat@codekitt.com)
    * @param content Content
    * @param flowId  Flow Id
    */
  final case class Command[Content](content: Content, flowId: FlowId) extends Event[Content]

  /**
    * Query event.
    *
    * @author Grumpy Cat (grumpycat@codekitt.com)
    * @param content Content
    * @param flowId  Flow Id
    */
  final case class Query[Content](content: Content, flowId: FlowId) extends Event[Content]

}