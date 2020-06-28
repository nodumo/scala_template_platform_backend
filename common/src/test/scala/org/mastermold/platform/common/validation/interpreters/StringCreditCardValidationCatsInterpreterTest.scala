package org.mastermold.platform.common.validation.interpreters

import org.mastermold.platform.common.validation.ErrorMessagesCollection
import org.specs2.Specification
import org.specs2.matcher.MatchResult

final class StringCreditCardValidationCatsInterpreterTest extends Specification {

  def is = s2"""
 Service should
   Should have correct count of validation messages              $spec1
   Should have correct count of validation messages               $spec2
                                                                 """

  private def spec1: MatchResult[ErrorMessagesCollection] =
    StringValidationCreditCardServiceApplicativeErrorInterpreter.rawErrorMessages must have size 6

  private def spec2: MatchResult[ErrorMessagesCollection] =
    StringValidationCreditCardServiceApplicativeErrorInterpreter.rawErrorMessages must have size 6
}
