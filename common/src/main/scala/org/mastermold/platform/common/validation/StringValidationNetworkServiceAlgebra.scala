package org.mastermold.platform.common.validation

/**
 * String network validation service algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 */
trait StringValidationNetworkServiceAlgebra[F[_]] {

  /**
   * Network website.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param string String to test
   */
  def networkWebsite(string: String): F[String]

  /**
   * Network website.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param string String to test
   */
  def networkEmail(string: String): F[String]

}
