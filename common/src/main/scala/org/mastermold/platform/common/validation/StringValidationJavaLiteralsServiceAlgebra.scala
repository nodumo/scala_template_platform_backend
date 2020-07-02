package org.mastermold.platform.common.validation

/**
 * String Java network validation service algebra.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam F Effect
 */
trait StringValidationJavaLiteralsServiceAlgebra[F[_]] {

  /**
   * Validate that the string is a valid [[java.util.UUID]].
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param string String to test
   */
  def validateUUID(string: String): F[String]

}
