package org.mastermold.platform.common.customizationslanguage.syntax

trait AnyExtensionSyntax {

  implicit def anyExtension[A](a: A): AnyExtension[A] = new AnyExtension(a)

}
