package org.mastermold.platform.infrastructure.nashorn.intepreters

import scala.concurrent.duration._
import java.util.concurrent.ExecutorService
import delight.nashornsandbox.{ NashornSandbox, NashornSandboxes }
import org.mastermold.platform.infrastructure.nashorn.NashornFactoryServiceAlgebra
import NashornFactoryServiceDelightInterpreter.{ From, To }
import org.mastermold.platform.common.units.Megabytes
import scala.concurrent.duration.Duration

/**
 * Nashorn factory service.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @usecase Creating new Nashorn delight interpreter
 * @param delightConfig Executor service
 */
final class NashornFactoryServiceDelightInterpreter(
    delightConfig: NashornFactoryServiceDelightInterpreter.DelightConfig)
    extends NashornFactoryServiceAlgebra[From, To] {

  private val stringArguments: String = "log4j.logger.delight.nashornsandbox.NashornSandbox=DEBUG"

  private def mbToBytesAsLong(megabytes: Megabytes): Long = megabytes.value * 1000000

  override def create(from: From): To = {
    val sandbox = NashornSandboxes.create(stringArguments)

    // Setters
    val settings = delightConfig.delightSettingsConfig
    sandbox.setMaxCPUTime(settings.maxCPUTime.toSeconds)
    sandbox.setMaxMemory(mbToBytesAsLong(settings.maxMemoryInMegabytes))
    sandbox.setMaxPreparedStatements(settings.maxPreparedStatements)
    sandbox.setExecutor(from)

    // Permissions
    val permissions = delightConfig.delightPermissionsConfig
    sandbox.allowReadFunctions(permissions.allowReadFunction)
    sandbox.allowNoBraces(permissions.allowNoBraces)
    sandbox.allowGlobalsObjects(permissions.allowGlobalsObjects)
    sandbox.allowPrintFunctions(permissions.allowPrintFunctions)
    sandbox.allowExitFunctions(permissions.allowExitFunctions)
    sandbox
  }

}

object NashornFactoryServiceDelightInterpreter {

  type From = ExecutorService

  type To = NashornSandbox

  final case class DelightConfig(delightSettingsConfig: DelightSettingsConfig,
                                 delightPermissionsConfig: DelightPermissionsConfig)

  final case class DelightSettingsConfig(maxCPUTime: Duration,
                                         maxMemoryInMegabytes: Megabytes,
                                         maxPreparedStatements: Int)

  final case class DelightPermissionsConfig(allowReadFunction: Boolean,
                                            allowNoBraces: Boolean,
                                            allowGlobalsObjects: Boolean,
                                            allowPrintFunctions: Boolean,
                                            allowExitFunctions: Boolean)

  private[infrastructure] val defaultDelightSettingsConfig: DelightSettingsConfig =
    DelightSettingsConfig(maxCPUTime = 200.millisecond,
                          maxMemoryInMegabytes = Megabytes(500),
                          maxPreparedStatements = 100)

  private[infrastructure] val defaultDelightPermissionsConfig: DelightPermissionsConfig = DelightPermissionsConfig(
    allowReadFunction = true,
    allowNoBraces = true,
    allowGlobalsObjects = true,
    allowPrintFunctions = true,
    allowExitFunctions = true)

  private[infrastructure] val defaultDelightConfig: DelightConfig =
    DelightConfig(defaultDelightSettingsConfig, defaultDelightPermissionsConfig)

}
