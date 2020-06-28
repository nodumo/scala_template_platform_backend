package org.mastermold.platform.common.validation

import cats.instances.all._

package object interpreters {

  val validatorsErrorMessages: ErrorMessagesCollection =
  StringValidationApplicationEntitiesServiceInterpreter.rawErrorMessages ++ StringValidationCreditCardApplicativeErrorInterpreter.rawErrorMessages

  object stringValidation extends StringValidationApplicationEntitiesServiceInterpreter

  object stringValidationCreditCard extends StringValidationCreditCardApplicativeErrorInterpreter

}
