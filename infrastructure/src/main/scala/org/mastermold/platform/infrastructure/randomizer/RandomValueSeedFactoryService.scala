package org.mastermold.platform.infrastructure.randomizer

/**
 * Random value service algebra.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam F Effect
 * @tparam Value Environment value
 */
trait RandomValueSeedFactoryService[F[_], Seed, Value] {

  def getRandomValue(seed: Seed): F[Value]

}
