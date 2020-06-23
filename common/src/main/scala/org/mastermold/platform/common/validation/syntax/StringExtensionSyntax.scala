package org.mastermold.platform.common.validation.syntax

trait StringExtensionSyntax {

  implicit def stringExtension(string: String): StringExtension =
    new StringExtension(string)

}
