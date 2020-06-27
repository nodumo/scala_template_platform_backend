package org.mastermold.platform.common.validation

/**
 * String date parsing algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @usecase Parse date values
 * @tparam F Effect
 * @tparam DateFormatYYYYMMDD Format YYYYMMDD
 * @tparam DateTimeFormatYYYYMMDDHHMISS Format YYYYMMDDHHMISS
 */
trait StringValidationDateParsingEffectServiceAlgebra[F[_], DateFormatYYYYMMDD, DateTimeFormatYYYYMMDDHHMISS] {

  def parseDateFormatYYYYMMDD(string: String): F[DateFormatYYYYMMDD]

  def parseDateTimeFormatYYYYMMDDHHMISS(string: String): F[DateTimeFormatYYYYMMDDHHMISS]

}
