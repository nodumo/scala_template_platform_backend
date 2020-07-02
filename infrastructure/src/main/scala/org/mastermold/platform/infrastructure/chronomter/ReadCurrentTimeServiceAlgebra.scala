package org.mastermold.platform.infrastructure.chronomter

/**
 * Read current time service algebra.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @todo Implement a test/constant value implementation for the test module.
 * @tparam F Command line arguments
 */
trait ReadCurrentTimeServiceAlgebra[F[_], CurrentTime] {

  def readCurrentTimeEffect: F[CurrentTime]

}
