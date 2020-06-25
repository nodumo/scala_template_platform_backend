package org.mastermold.platform.domain.boundedcontexts.resources.models.shared

import java.util.UUID
import cats.Eq
import org.mastermold.platform.domain.definitions.DomainValue


/**
  * Host provider.
  *
  * @author Nick Odumo (nodumowebdev@gmail.com)
  * @param value Foreign table value
  */
sealed abstract class HostProvider(val value: HostProvider.Repr) extends DomainValue

object HostProvider {

  type Repr = UUID

  case object Cloudinary extends HostProvider(UUID.fromString("eadbd230-7359-44a6-a5e1-7b0792af653b"))

  case object S3 extends HostProvider(UUID.fromString("9d1139bf-a9d9-43e3-8b37-a015fd0d964f"))

  implicit def eqCats(implicit eqReprCats: Eq[Repr]): Eq[HostProvider] = new Eq[HostProvider] {

    override def eqv(x: HostProvider, y: HostProvider): Boolean = eqReprCats.eqv(x.value, y.value)

  }

}