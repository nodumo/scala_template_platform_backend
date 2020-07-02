package org.mastermold.platform.servercore

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

/**
  * HTTP4S .
  *
  * @author Grumpy Cat (grumpycat@codekitt.com)
  */
package object route {

  private val runtime = Runtime.getRuntime
  private val scriptRunningExecutorService: ExecutorService =
    Executors.newFixedThreadPool(runtime.availableProcessors())

}
