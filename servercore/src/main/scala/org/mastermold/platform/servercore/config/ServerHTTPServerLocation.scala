package org.mastermold.platform.servercore.config

import org.mastermold.platform.common.validation.{CheckedHostLocation, CheckedHostPort}

/**
  * Sever HTTP server location.
  *
  * @author Nick Odumo (nodumo@nodumo.com)
  * @param location Server host location address
  * @param port     Server host port
  */
final case class ServerHTTPServerLocation private[config](location: CheckedHostLocation, port: CheckedHostPort)