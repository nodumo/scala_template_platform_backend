package org.mastermold.platform.serverapi

import zio.{ExitCode, ZEnv, ZIO}
import zio.interop.catz._

/*
 *     ____  __      __  ____
 *    / __ \/ /___ _/ /_/ __/___  _________ ___
 *   / /_/ / / __ `/ __/ /_/ __ \/ ___/ __ `__ \
 *  / ____/ / /_/ / /_/ __/ /_/ / /  / / / / / /
 * /_/   /_/\__,_/\__/_/  \____/_/  /_/ /_/ /_/ ©
 *
 * (c) Platform Grumpy Cat (grumpycat@codekitt.com)
 *
 * Server API application.
 */
object ServerAPIApplication extends CatsApp {

  /**
    * Server API application.
    *
    * @author Grumpy Cat (grumpycat@codekitt.com)
    * @param args Command line arguments
    */
  def run(args: List[String]): ZIO[ZEnv, Nothing, ExitCode] = ???


}
