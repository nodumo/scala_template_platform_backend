package org.mastermold.platform.servercore

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

/**
  * HTTP4S .
  *
  * @author Nick Odumo (nodumo@nodumo.com)
  */
package object route {

  private val runtime = Runtime.getRuntime
  private val scriptRunningExecutorService: ExecutorService =
    Executors.newFixedThreadPool(runtime.availableProcessors())

}
