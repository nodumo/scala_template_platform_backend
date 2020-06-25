package org.mastermold.platform.domain.boundedcontexts.resources.models.shared

/**
  * Extension values.
  *
  * @author Nick Odumo (nodumowebdev@gmail.com)
  * @param extension Extension value
  */
sealed abstract class FileType(val extension: String)

object FileType {

  // --- Type: Archive

  case object Zip extends FileType("zip")

  case object Zip7 extends FileType("7z")

  // --- Type: Image

  case object JPG extends FileType("jpg")

  case object Jpeg extends FileType("jpeg")

  case object Png extends FileType("png")

  // --- Typed: Code

  case object A extends FileType("jpg")

  case object `C#` extends FileType(".cs")

  case object `C++` extends FileType("cpp")

  case object C extends FileType("c")

  case object CSS extends FileType("css")

  case object Java extends FileType("java")

  case object Javascript extends FileType("js")

  case object PHP extends FileType("php")

  case object Python extends FileType("py")

  case object Scala extends FileType("scala")

  case object SCSS extends FileType("scss")

  case object SQL extends FileType("sql")

  case object Swift extends FileType("swift")

  case object Rust extends FileType("rs")

  case object Typescript extends FileType("ts")

  final case class Misc(extensionP: String) extends FileType(extensionP)

}
