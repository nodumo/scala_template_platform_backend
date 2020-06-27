package org.mastermold.platform.common.validation

package object interpreters {

  val validatorsErrorMessages: ErrorMessagesCollection =
  StringValidationApplicationEntitiesServiceInterpreter.rawErrorMessages ++ StringValidationCreditCardApplicativeErrorInterpreter.rawErrorMessages

}
