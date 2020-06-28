package org.mastermold.platform.common.validation

trait StringParsingJavaLiteralsServiceAlgebra[F[_], UUID] {

  /**
   * Parse string if valid [[java.util.UUID]].
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param string String to test
   */
  def parseUUID(string: String): F[UUID]

}
