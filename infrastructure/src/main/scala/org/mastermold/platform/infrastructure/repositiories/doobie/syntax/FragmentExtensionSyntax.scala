package org.mastermold.platform.infrastructure.repositiories.doobie.syntax

import doobie.util.fragment.Fragment

trait FragmentExtensionSyntax {

  implicit def fragmentExtension(fragment: Fragment): FragmentExtension =
    new FragmentExtension(fragment)

}
