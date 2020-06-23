package org.mastermold.platform.common.validation.syntax

import scala.util.matching.Regex

final class RegexExtension(regex: Regex) {

  def isMatchString(string: String): Boolean =
    regex.pattern.matcher(string).matches

  def isNotMatchString(string: String): Boolean =
    isMatchString(string)

}
