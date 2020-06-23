package org.mastermold.platform.infrastructure

import java.util.concurrent.Executors

import org.mastermold.platform.infrastructure.nashorn.intepreters.NashornFactoryServiceDelightInterpreter

import scala.io.Source

object Main extends App {

  private val javascriptHelloWorldProgram = Source.fromResource("javascript/nunjucks.js").mkString

  private def createDelight: NashornFactoryServiceDelightInterpreter =
    new NashornFactoryServiceDelightInterpreter(NashornFactoryServiceDelightInterpreter.defaultDelightConfig)

  createDelight.create(Executors.newFixedThreadPool(1)).eval(javascriptHelloWorldProgram)

}
