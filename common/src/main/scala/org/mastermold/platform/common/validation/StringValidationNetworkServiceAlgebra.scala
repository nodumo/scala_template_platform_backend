package org.mastermold.platform.common.validation

/**
 * String network validation service algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 */
trait StringValidationNetworkServiceAlgebra[F[_]] {

  def networkIP(string: String): F[String]

  def networkIPV6(string: String): F[String]

  def networkWebsite(string: String): F[String]

  def networkEmail(string: String): F[String]

}
