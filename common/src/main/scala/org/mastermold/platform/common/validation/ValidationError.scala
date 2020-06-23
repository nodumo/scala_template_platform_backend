package org.mastermold.platform.common.validation

import cats.Show
import org.mastermold.platform.common.logging.ShowLoggable

/**
 * Validation algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param value Underlying value
 */
final case class ValidationError private[validation] (value: ValidationError.Repr) extends AnyVal

object ValidationError {

  type Repr = String

  implicit def instanceShow(implicit show: Show[Repr]): ShowLoggable[ValidationError] =
    ShowLoggable.createInstanceFromFunctionToRepr[ValidationError](x => show.show(x.value))

}
