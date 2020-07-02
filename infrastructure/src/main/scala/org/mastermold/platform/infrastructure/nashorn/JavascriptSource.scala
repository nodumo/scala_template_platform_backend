package org.mastermold.platform.infrastructure.nashorn

import org.mastermold.platform.common.logging.{ SafeLogString, ShowLoggable }

/**
 * Script source definitions.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @param name Name
 * @param source Source string
 * @param bindings Bindings map
 */
final case class JavascriptSource(name: String, source: String, bindings: Map[String, Any])

object JavascriptSource {

  private def javascriptSourceToString(javascriptSource: JavascriptSource): SafeLogString.Repr =
    s"""
     |  JavascriptSource {
     |  Name: %s
     |  Source: %s
     | }
   """.stripMargin.format(javascriptSource.name, javascriptSource.source)

  implicit val showLoggable: ShowLoggable[JavascriptSource] =
    ShowLoggable.createInstanceFromFunctionToRepr(javascriptSourceToString)

}
