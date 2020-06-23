package org.mastermold.platform.common.validation

import org.mastermold.platform.common.validation.syntax.RegexExtension

/**
 * String validation service algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 */
trait StringValidationServiceAlgebra[F[_]] {

  def isLongerThan(int: Int)(string: String): F[String]

  def isShorterThan(int: Int)(string: String): F[String]

  def isMatchingRegex(int: Int)(regex: RegexExtension): F[String]

}
