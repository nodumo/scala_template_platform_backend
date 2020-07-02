package org.mastermold.platform.infrastructure.http

/**
 * Transaction context object for a given request.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @param name HTTP request name
 */
sealed abstract class HttpVerb(val name: String) {

  def lowerCaseName: String = name.toLowerCase

}

object HttpVerb {

  final case object Get extends HttpVerb("Get")

  final case object Delete extends HttpVerb("Delete")

  final case object Put extends HttpVerb("Put")

  final case object Post extends HttpVerb("Post")

}
