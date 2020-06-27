package org.mastermold.platform.infrastructure.repositiories.doobie.syntax

import doobie.implicits._
import doobie.util.fragment.Fragment

class FragmentExtension(fragment: Fragment) {

  def +++(fragmentToCon: Fragment): Fragment = conjWithSpace(fragment)

  def conjWithSpace(fragmentToCon: Fragment): Fragment = fragmentToCon ++ fr" " ++ fragment

}
