package org.mastermold.platform.domain.boundedcontexts.resources.models.artifactaccesspass

import java.util.UUID

import org.mastermold.platform.domain.definitions.DomainValue

/**
  * Pass type for the resource
  *
  * @author Nick Odumo (nodumo@nodumo.com
  * @param value Foreign key.
  */
sealed abstract class PassType(val value: PassType.Repr) extends DomainValue

object PassType {

  type Repr = UUID

  case object OneTimePass extends PassType(UUID.fromString("57f86d10-9b68-4354-a898-68d8b2d3cc81"))

  case object MultiUsePass extends PassType(UUID.fromString("ad8e053e-353e-4151-b371-f99909cabf80"))

}