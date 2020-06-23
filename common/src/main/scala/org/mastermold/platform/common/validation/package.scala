package org.mastermold.platform.common

import cats.{ ApplicativeError, MonadError }
import cats.data.{ NonEmptyList, Validated }

package object validation {

  type ApplicativeValidationError[F[_]] = ApplicativeError[F, ValidationError]

  type ErrorMessagesCollection = Set[String]

  type MonadErrorValidationError[F[_]] = MonadError[F, ValidationError]

  type NonEmptyListValidationError = NonEmptyList[ValidationError]

  type Predicate[A] = A => Boolean

  type ValidatedValidationErrorF[A] = Validated[ValidationError, A]

}
