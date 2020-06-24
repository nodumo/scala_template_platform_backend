package org.mastermold.platform.application.definitions

/**
  * Application event.
  *
  * @author Nick Odumo (nodumo@nodumo.com
  * @usecase Modelling the application input
  * @tparam Content    Content to process
  * @tparam FlowIdRepr Flow id representation
  */
trait Event[Content, FlowIdRepr] {

  val content: Content

  val flowId: FlowIdRepr

}

object Event {

  /**
    * Command event.
    *
    * @author Nick Odumo (nodumo@nodumo.com
    * @param content Content
    * @param flowId  Flow Id
    */
  final case class Command[Content, FlowIdRepr](content: Content, flowId: FlowIdRepr) extends Event[Content, FlowIdRepr]

  /**
    * Query event.
    *
    * @author Nick Odumo (nodumo@nodumo.com
    * @param content Content
    * @param flowId  Flow Id
    */
  final case class Query[Content, FlowIdRepr](content: Content, flowId: FlowIdRepr) extends Event[Content, FlowIdRepr]

}