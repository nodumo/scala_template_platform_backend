package org.mastermold.platform.domain.boundedcontexts.resources.models.shared

import org.mastermold.platform.domain.definitions.DomainValue

final case class DateTimeUpload private[domain] (value: DateTimeUpload.Repr) extends DomainValue

object DateTimeUpload {

  type Repr = String

}
