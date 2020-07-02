package org.mastermold.platform.infrastructure.logging.interpreters

import doobie.util.log.{ ExecFailure, LogHandler, ProcessingFailure, Success }
import org.mastermold.platform.infrastructure.logging.{ LogHandlerFactoryServiceAlgebra, LoggingUnsafeAdapterAlgebra }
import org.mastermold.platform.infrastructure.logging.interpreters.{
  LogHandlerFactoryServiceInterpreter => Interpreter
}

/**
 * Doobie logging handler.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @usecase Logging Doobie unsafe transactions
 * @param loggingUnsafeAdapter Logging unsafe adapter
 */
final class LogHandlerFactoryServiceInterpreter(private val loggingUnsafeAdapter: LoggingUnsafeAdapterAlgebra[String])
    extends LogHandlerFactoryServiceAlgebra[Interpreter.From, Interpreter.To] {

  override def create(from: Interpreter.From): Interpreter.To =
    LogHandler {

      case Success(sql, args, exec, processing) =>
        loggingUnsafeAdapter.info(s"""Successful Statement Execution:
        |
        |  ${sql.lines.dropWhile(_.trim.isEmpty).mkString("\n  ")}
        |
        | arguments = [${args.mkString(", ")}]
        | elapsed = ${exec.toMillis} ms exec + ${processing.toMillis} ms processing (${(exec + processing).toMillis} ms total)
      """.stripMargin)

      case ProcessingFailure(sql, args, exec, e2, t) =>
        loggingUnsafeAdapter.danger(s"""Failed Resultset Processing:
        |
        |  ${sql.lines.dropWhile(_.trim.isEmpty).mkString("\n  ")}
        |
        | arguments = [${args.mkString(", ")}]
        | elapsed = ${exec.toMillis} ms exec + ${e2.toMillis} ms processing (failed) (${(exec + e2).toMillis} ms total)
        | failure = ${t.getMessage}
      """.stripMargin)

      case ExecFailure(s, a, e1, t) =>
        loggingUnsafeAdapter.danger(s"""Failed Statement Execution:
                            |
        |  ${s.lines.dropWhile(_.trim.isEmpty).mkString("\n  ")}
                            |
        | arguments = [${a.mkString(", ")}]
        | elapsed = ${e1.toMillis} ms exec (failed)
        | failure = ${t.getMessage}
      """.stripMargin)

    }

}

object LogHandlerFactoryServiceInterpreter {

  final case class Config()

  type From = Config

  type To = LogHandler

  def apply(
      loggingUnsafeAdapter: LoggingUnsafeAdapterAlgebra[String]
  ): LogHandlerFactoryServiceInterpreter = new LogHandlerFactoryServiceInterpreter(loggingUnsafeAdapter)

}
