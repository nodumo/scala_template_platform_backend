package org.mastermold.platform.common.validation

/**
 * String network validation service algebra.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam F Effect
 */
trait StringValidationNetworkServiceAlgebra[F[_]] {

  /**
   * Network email.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param string String to test
   */
  def networkEmail(string: String): F[String]

  /**
   * Network website.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param string String to test
   */
  def networkWebsite(string: String): F[String]

}
