package org.mastermold.platform.common.validation.syntax

import org.mastermold.platform.common.validation.ValidationError

final class StringExtension(string: String) {

  def toValidationError: ValidationError = ValidationError(string)

}
