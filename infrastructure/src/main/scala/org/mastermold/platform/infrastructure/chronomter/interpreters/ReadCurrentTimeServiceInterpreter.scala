package org.mastermold.platform.infrastructure.chronomter.interpreters

import org.mastermold.platform.common.validation.CheckedTimeStampStringHHmmss
import org.mastermold.platform.infrastructure.chronomter.ReadCurrentTimeServiceAlgebra

/**
 * Read current timestamp.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @see https://www.postgresql.org/docs/9.6
 * @tparam F Effect
 */
final class ReadCurrentTimeServiceInterpreter[F[_]]
    extends ReadCurrentTimeServiceAlgebra[F, CheckedTimeStampStringHHmmss] {

  override def readCurrentTimeEffect: F[CheckedTimeStampStringHHmmss] =
    ???

}

object ReadCurrentTimeServiceInterpreter {

  def apply[F[_]]: ReadCurrentTimeServiceInterpreter[F] =
    new ReadCurrentTimeServiceInterpreter()

}
