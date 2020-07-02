package org.mastermold.platform.common.validation

/**
 * String date parsing algebra.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @usecase Parse date values
 * @tparam F Effect
 * @tparam DateFormatYYYYMMDD Format YYYYMMDD
 * @tparam DateTimeFormatYYYYMMDDHHMISS Format YYYYMMDDHHMISS
 */
trait StringParsingDateEffectServiceAlgebra[F[_], DateFormatYYYYMMDD, DateTimeFormatYYYYMMDDHHMISS] {

  def parseDateFormatYYYYMMDD(string: String): F[DateFormatYYYYMMDD]

  def parseDateTimeFormatYYYYMMDDHHMISS(string: String): F[DateTimeFormatYYYYMMDDHHMISS]

}
