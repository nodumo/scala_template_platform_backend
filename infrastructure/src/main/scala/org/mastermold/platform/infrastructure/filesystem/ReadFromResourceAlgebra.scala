package org.mastermold.platform.infrastructure.filesystem

trait ReadFromResourceAlgebra[F[_], FileName] {

  def readFromResourceDirectory(fileName: FileName): F[String]

}
