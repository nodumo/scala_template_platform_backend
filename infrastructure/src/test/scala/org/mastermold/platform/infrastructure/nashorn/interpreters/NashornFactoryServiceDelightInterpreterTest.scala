package org.mastermold.platform.infrastructure.nashorn.interpreters

import java.util.concurrent.Executors

import org.mastermold.platform.infrastructure.nashorn.intepreters.NashornFactoryServiceDelightInterpreter
import org.specs2.Specification

import scala.io.Source

final class NashornFactoryServiceDelightInterpreterTest extends Specification {

  def is = s2"""

 Service should
   Delight interpreter must be returned by factory               $e1
   Delight interpreter must not be error                         $e2
                                                                 """

  private val javascriptHelloWorldProgram = Source.fromResource("javascript/nunjucks.js").mkString

  private def createDelight: NashornFactoryServiceDelightInterpreter =
    new NashornFactoryServiceDelightInterpreter(NashornFactoryServiceDelightInterpreter.defaultDelightConfig)

  private def e1 =
    createDelight must not be null
  //
  private def e2 =
    createDelight.create(Executors.newFixedThreadPool(1)).eval(javascriptHelloWorldProgram) must not isError

}
