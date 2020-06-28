package org.mastermold.platform.common.validation

/**
 * String Java network validation service algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 */
trait StringValidationJavaLiteralsServiceAlgebra[F[_]] {

  /**
   * Validate that the string is a valid [[java.util.UUID]].
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param string String to test
   */
  def validateUUID(string: String): F[String]

}
