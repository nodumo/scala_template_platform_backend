package org.mastermold.platform.common.validation

trait StringParsingJavaLiteralsServiceAlgebra[F[_], UUID] {

  /**
   * Parse string if valid [[java.util.UUID]].
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @param string String to test
   */
  def parseUUID(string: String): F[UUID]

}
