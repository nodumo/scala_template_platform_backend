package org.mastermold.platform.common.validation

/**
 * String application validation service algebra.
 * Checks typical application entities in one service
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 */
trait StringValidationApplicationEntitiesServiceAlgebra[F[_]] {

  /**
   * Validate this is the usual application "Username"
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param string String to test
   */
  def applicationUsername(string: String): F[String]

  /**
   * Validate this is the usual application "Password"
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param string String to test
   */
  def applicationPassword(string: String): F[String]

  /**
   * Validate this is the usual application "Entity title"
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param string String to test
   */
  def applicationEntityTitle(string: String): F[String]

  /**
   * Validate this is the usual application "Empty content"
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param string String to test
   */
  def contentEmpty(string: String): F[String]

  /**
   * Validate this is the usual application "Non-empty content"
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param string String to test
   */
  def contentNotEmpty(string: String): F[String]

}
