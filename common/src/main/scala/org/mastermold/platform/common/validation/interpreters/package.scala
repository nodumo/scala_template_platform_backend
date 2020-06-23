package org.mastermold.platform.common.validation

package object interpreters {

  val validatorsErrorMessages: ErrorMessagesCollection =
  StringApplicationValidationServiceInterpreter.rawErrorMessages ++ StringCreditCardValidationCatsInterpreter.rawErrorMessages

}
