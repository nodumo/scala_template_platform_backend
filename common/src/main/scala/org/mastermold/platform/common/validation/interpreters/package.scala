package org.mastermold.platform.common.validation

import cats.instances.all._

package object interpreters {

  val validatorsErrorMessages: ErrorMessagesCollection =
  StringValidationApplicationEntitiesServiceApplicativeErrorInterpreter.rawErrorMessages ++
  StringValidationCreditCardApplicativeErrorInterpreter.rawErrorMessages

  object stringValidation extends StringValidationServiceApplicativeErrorInterpreter

  object stringValidationApplicationEntities
      extends StringValidationApplicationEntitiesServiceApplicativeErrorInterpreter

  object stringValidationCreditCard extends StringValidationCreditCardApplicativeErrorInterpreter

}
