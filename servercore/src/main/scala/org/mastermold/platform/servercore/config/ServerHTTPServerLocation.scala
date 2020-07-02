package org.mastermold.platform.servercore.config

import org.mastermold.platform.common.validation.{CheckedNetworkHostLocation, CheckedNetworkHostPort}

/**
  * Sever HTTP server location.
  *
  * @author Grumpy Cat (grumpycat@codekitt.com)
  * @param location Server host location address
  * @param port     Server host port
  */
final case class ServerHTTPServerLocation private[config](location: CheckedNetworkHostLocation, port: CheckedNetworkHostPort)