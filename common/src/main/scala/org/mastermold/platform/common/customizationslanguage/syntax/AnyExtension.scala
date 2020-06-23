package org.mastermold.platform.common.customizationslanguage.syntax

/**
 * Useful language extensions.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 * @param anyValue Any value
 */
final class AnyExtension[A](anyValue: A) {

  /**
   * Based on the Elm continuation function.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @see https://package.elm-lang.org/packages/turboMaCk/elm-continue/latest/Continue
   * @param function Continuation function
   */
  def applyFun[B](function: A => B): B = function(anyValue)

  /**
   * Based on the Elm continuation function.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @param function Continuation function
   */
  def |>[B](function: A => B): B = applyFun(function)

  /**
   * Return const. function for arbitrary value.
   *
   * @author Nick Odumo (nodumo@nodumo.com)
   * @tparam B Any value for function parameter
   */
  def asConstFunction[B]: B => A = _ => anyValue

}
