import monocle.macros.GenLens
import org.scalatest.FunSuite

class Test extends FunSuite {

  test("bigData can use common sub-project") {
    val entity = Entity("id", NestedEntity("value"))
  }

  test("bigData can use monocle dependency ") {
    val idLens = GenLens[Entity](_.id)
  }
}
