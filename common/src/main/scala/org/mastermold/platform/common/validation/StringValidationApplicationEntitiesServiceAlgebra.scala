package org.mastermold.platform.common.validation

/**
 * String application validation service algebra.
 * Checks typical application entities in one service
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam F Effect
 */
trait StringValidationApplicationEntitiesServiceAlgebra[F[_]] {

  /**
   * Validate this is the usual application "Username"
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param string String to test
   */
  def applicationUsername(string: String): F[String]

  /**
   * Validate this is the usual application "Password"
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param string String to test
   */
  def applicationPassword(string: String): F[String]

  /**
   * Validate this is the usual application "Entity title"
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param string String to test
   */
  def applicationEntityTitle(string: String): F[String]

  /**
   * Validate this is the usual application "Empty content"
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param string String to test
   */
  def contentEmpty(string: String): F[String]

  /**
   * Validate this is the usual application "Non-empty content"
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param string String to test
   */
  def contentNotEmpty(string: String): F[String]

}
