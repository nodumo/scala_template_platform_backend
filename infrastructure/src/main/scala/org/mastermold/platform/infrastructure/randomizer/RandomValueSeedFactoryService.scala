package org.mastermold.platform.infrastructure.randomizer

/**
 * Random value service algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 * @tparam Value Environment value
 */
trait RandomValueSeedFactoryService[F[_], Seed, Value] {

  def getRandomValue(seed: Seed): F[Value]

}
