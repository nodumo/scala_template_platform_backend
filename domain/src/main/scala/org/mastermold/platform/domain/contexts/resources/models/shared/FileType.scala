package org.mastermold.platform.domain.contexts.resources.models.shared

sealed abstract class FileType(val extension: String)

object FileType {

  // --- Type: Archive

  case object Zip extends FileType("zip")

  case object Zip7 extends FileType("7z")

  // --- Type: Image

  case object JPG extends FileType("jpg")

  case object Jpeg extends FileType("jpeg")

  case object Png extends FileType("png")

}
