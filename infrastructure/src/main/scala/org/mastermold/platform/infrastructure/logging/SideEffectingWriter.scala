package org.mastermold.platform.infrastructure.logging

import java.io.Writer

/**
 * Custom writer based on Java writer interface
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @usecase Initially conceived for use for outputting what is happening within
 *          the Java Delight nashorn interpreter.
 */
abstract class SideEffectingWriter extends Writer {

  override def append(c: Char): Writer = super.append(c)

  override def close(): Unit = ()

  override def flush(): Unit = ()

  override def append(csq: CharSequence): Writer = super.append(csq)

  override def write(cbuf: Array[Char]): Unit = println(cbuf)

  override def write(cbuf: Array[Char], off: Int, len: Int): Unit = println(cbuf)

}
