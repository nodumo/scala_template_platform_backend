package org.mastermold.platform.infrastructure.repositiories.doobie.instances.common

import doobie.util.{Get, Put}
import org.mastermold.platform.common.validation.{Checked9DigitNumber, CheckedCorrespondenceEmail, CheckedNetworkEmailString, CheckedNetworkHostLocation, CheckedNetworkHostPort, CheckedNetworkWebsite}

/**
  * Validation instances.
  *
  * @author Nick Odumo (nodumo@nodumo.com)
  * @usecase Validation instances for checked values
  */
trait ValidationInstances {

  //--- Instances: Checked values

  implicit val checkedCorrespondenceEmailGet: Get[CheckedCorrespondenceEmail] = Get[CheckedCorrespondenceEmail.Repr].tmap(CheckedCorrespondenceEmail.apply)
  implicit val checkedCorrespondenceEmailPut: Put[CheckedCorrespondenceEmail] = Put[CheckedCorrespondenceEmail.Repr].tcontramap(_.value)

  implicit val checkedNetworkHostLocationGet: Get[CheckedNetworkHostLocation] = Get[CheckedNetworkHostLocation.Repr].tmap(CheckedNetworkHostLocation.apply)
  implicit val checkedNetworkHostLocationPut: Put[CheckedNetworkHostLocation] = Put[CheckedNetworkHostLocation.Repr].tcontramap(_.value)

  implicit val checkedHostPortGet: Get[CheckedNetworkHostPort] = Get[CheckedNetworkHostPort.Repr].tmap(CheckedNetworkHostPort.apply)
  implicit val checkedHostPortPut: Put[CheckedNetworkHostPort] = Put[CheckedNetworkHostPort.Repr].tcontramap(_.value)

  implicit val checkedNetworkHostPortGet: Get[CheckedNetworkHostPort] = Get[CheckedNetworkHostPort.Repr].tmap(CheckedNetworkHostPort.apply)
  implicit val checkedNetworkHostPortPut: Put[CheckedNetworkHostPort] = Put[CheckedNetworkHostPort.Repr].tcontramap(_.value)

  implicit val checkedNetworkEmailStringGet: Get[CheckedNetworkEmailString] = Get[CheckedNetworkEmailString.Repr].tmap(CheckedNetworkEmailString.apply)
  implicit val checkedNetworkEmailStringPut: Put[CheckedNetworkEmailString] = Put[CheckedNetworkEmailString.Repr].tcontramap(_.value)

  implicit val checkedNetworkWebsiteGet: Get[CheckedNetworkWebsite] = Get[CheckedNetworkWebsite.Repr].tmap(CheckedNetworkWebsite.apply)
  implicit val checkedNetworkWebsitePut: Put[CheckedNetworkWebsite] = Put[CheckedNetworkWebsite.Repr].tcontramap(_.value)

  implicit val checked9DigitNumberGet: Get[Checked9DigitNumber] = Get[Checked9DigitNumber.Repr].tmap(Checked9DigitNumber.apply)
  implicit val checked9DigitNumberPut: Put[Checked9DigitNumber] = Put[Checked9DigitNumber.Repr].tcontramap(_.value)

}
