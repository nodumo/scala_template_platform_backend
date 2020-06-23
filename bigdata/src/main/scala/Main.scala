import monocle.macros.GenLens

object Main extends App {
  println("bigData can use common sub-project")

  val entity = Entity("id", NestedEntity("value"))

  println("bigData can use monocle dependency")

  val idLens = GenLens[Entity](_.id)
}
