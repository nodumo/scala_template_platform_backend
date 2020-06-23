package org.mastermold.platform.infrastructure

import doobie.util.transactor.Transactor.Aux
import zio.Task

package object execution {

  type IOTransactor = Aux[Task, Unit]

}
