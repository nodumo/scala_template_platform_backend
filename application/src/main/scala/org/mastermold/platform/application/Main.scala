package org.mastermold.platform.application

object Main extends App {
  println("infrastructure can use common sub-project")

  import pureconfig._

  implicit def hint[T]: ProductHint[T] = ProductHint[T](ConfigFieldMapping(CamelCase, KebabCase))

}
