package org.mastermold.platform.servercore.middleware

/**
  * HTTP4S middlewear.
  *
  * @author Nick Odumo (nodumo@nodumo.com)
  * @tparam F Effect monad
  */
trait MiddlewearAlgebra[F[_]] {

  /**
    * HTTP4S middlewear transformer.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    */
  def handle(): Unit

}
