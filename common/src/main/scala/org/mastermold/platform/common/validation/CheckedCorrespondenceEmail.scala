package org.mastermold.platform.common.validation

final case class CheckedCorrespondenceEmail private[validation] (value: CheckedCorrespondenceEmail.Repr) extends AnyVal

object CheckedCorrespondenceEmail {

  type Repr = String

}
