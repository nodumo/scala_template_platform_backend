package org.mastermold.platform.common.validation.interpreters

import org.mastermold.platform.common.validation.ValidationServiceAlgebra
import org.mastermold.platform.common.validation.syntax.all._
import scala.util.matching.Regex

/**
 * Validation string utilities.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @tparam F Effect
 * @tparam E Error type
 */
trait ValidationServiceStringMixinInterpreter[F[_], E] { this: ValidationServiceAlgebra[F, E] =>

  /**
   * Test regular expression on string.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param regex Regex to test with
   * @param string String to test against
   * @param validationError Validation message
   */
  def validateRegex(regex: Regex, string: String)(validationError: E): F[String] =
    validatedWithBool(regex.isMatchString(string), string)(validationError)

}
