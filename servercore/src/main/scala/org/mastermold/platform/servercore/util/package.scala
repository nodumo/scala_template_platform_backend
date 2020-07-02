package org.mastermold.platform.servercore

package object util {

  def asciiMessage(message: String):String =
    s"""
    |/*
    | *     ____  __      __  ____
    | *    / __ \/ /___ _/ /_/ __/___  _________ ___
    | *   / /_/ / / __ `/ __/ /_/ __ \/ ___/ __ `__ \
    | *  / ____/ / /_/ / /_/ __/ /_/ / /  / / / / / /
    | * /_/   /_/\__,_/\__/_/  \____/_/  /_/ /_/ /_/ ©
    | *
    | * (c) Platform Grumpy Cat (grumpycat@codekitt.com)
    | *
    | * For the full copyright and license information, please view the LICENSE
    | * file that was distributed with this source code.
    | *
    | * $message
    | */
  """.stripMargin

}
