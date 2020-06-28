package org.mastermold.platform.common.validation.interpreters

import org.mastermold.platform.common.validation.ErrorMessagesCollection
import org.specs2.Specification
import org.specs2.matcher.MatchResult

final class StringApplicationValidationServiceInterpreterTest extends Specification {

  def is = s2"""
 Service should
   Should have correct count of validation messages              $spec1
   Delight interpreter must be returned by factory               $spec2
                                                                 """

  private def spec1: MatchResult[ErrorMessagesCollection] =
    StringValidationApplicationEntitiesServiceApplicativeErrorInterpreter.rawErrorMessages must have size 5

  private def spec2: MatchResult[ErrorMessagesCollection] =
    StringValidationApplicationEntitiesServiceApplicativeErrorInterpreter.rawErrorMessages must have size 5
}
