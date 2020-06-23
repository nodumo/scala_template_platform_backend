package org.mastermold.platform.serverapi.response

/**
  * API response version 1.
  *
  * @author Nick Odumo (nodumo@nodumo.com)
  * @usecase API response version 1
  */
sealed abstract class APIResponseVersion1

object APIResponseVersion1 {

  // --- ADT

  /**
    * Success response.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @param payload Payload
    */
  final case class SuccessResponse[Payload] private(payload: Payload) extends APIResponseVersion1

  /**
    * Failure response.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @param errorPayload Payload
    */
  final case class FailureResponse[ErrorPayload] private(errorPayload: ErrorPayload) extends APIResponseVersion1

  // --- Smart constructors

  /**
    * Success response.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @param payload Payload
    */
  def successResponse[Payload](payload: Payload): SuccessResponse[Payload] =
    SuccessResponse(payload)

  /**
    * Failure response.
    *
    * @author Nick Odumo (nodumo@nodumo.com)
    * @param errorPayload Payload
    */
  def failureResponse[ErrorPayload](errorPayload: ErrorPayload): FailureResponse[ErrorPayload] =
    FailureResponse(errorPayload)

}