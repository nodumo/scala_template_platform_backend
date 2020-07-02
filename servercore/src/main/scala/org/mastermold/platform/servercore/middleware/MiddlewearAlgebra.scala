package org.mastermold.platform.servercore.middleware

/**
  * HTTP4S middlewear.
  *
  * @author Grumpy Cat (grumpycat@codekitt.com)
  * @tparam F Effect monad
  */
trait MiddlewearAlgebra[F[_]] {

  /**
    * HTTP4S middlewear transformer.
    *
    * @author Grumpy Cat (grumpycat@codekitt.com)
    */
  def handle(): Unit

}
