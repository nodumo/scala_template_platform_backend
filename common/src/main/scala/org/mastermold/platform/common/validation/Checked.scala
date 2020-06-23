package org.mastermold.platform.common.validation

/**
 * Checked value.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param value Value
 */
final case class Checked[Value](value: Value) extends AnyVal
