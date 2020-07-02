package org.mastermold.platform.infrastructure.randomizer

/**
 * Random value service algebra.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam F Effect
 * @tparam Value Environment value
 */
trait RandomValueFactoryServiceAlgebra[F[_], Value] {

  def getRandomValue: F[Value]

}
