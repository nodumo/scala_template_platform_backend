import org.scalatest.FunSuite

class Test extends FunSuite {

  test("infrastructure can use common sub-project") {
    val entity = Entity("id", NestedEntity("value"))
  }

  test("infrastructure can use pureconfig dependency") {
    import pureconfig._

    implicit def hint[T]: ProductHint[T] = ProductHint[T](ConfigFieldMapping(CamelCase, KebabCase))
  }
}
