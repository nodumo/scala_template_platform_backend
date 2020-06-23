package org.mastermold.platform.common.validation.syntax

import scala.util.matching.Regex

trait RegexExtensionSyntax {

  implicit def regexExtension(regex: Regex): RegexExtension =
    new RegexExtension(regex)

}
