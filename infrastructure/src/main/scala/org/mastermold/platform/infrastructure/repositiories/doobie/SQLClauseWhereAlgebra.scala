package org.mastermold.platform.infrastructure.repositiories.doobie

import doobie.util.Put

/**
 * Where clause mixing query algebra.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com
 * @tparam SQLColumnNameT Name of the column
 * @tparam SQLQueryFragment Query fragment
 */
trait SQLClauseWhereAlgebra[SQLColumnNameT, SQLQueryFragment] {

  // --- Where: Equality check

  /**
   * Where is equal to.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @tparam Column Column type
   * @param sqlColumnNameOption Optional column name
   */
  protected def whereEquals[Column](column: Column, sqlColumnNameOption: Option[SQLColumnNameT] = None)(
      implicit put: Put[Column]): SQLQueryFragment

  /**
   * Where is not equal to.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @tparam Column Column type
   * @param sqlColumnNameOption Optional column name
   */
  protected def whereNotEquals[Column](column: Column, sqlColumnNameOption: Option[SQLColumnNameT] = None)(
      implicit put: Put[Column]): SQLQueryFragment

  // --- Where: Magnitude

  /**
   * Where greater than.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @tparam Column Column type
   * @param sqlColumnNameOption Optional column name
   */
  protected def whereGreaterThan[Column](column: Column, sqlColumnNameOption: Option[SQLColumnNameT] = None)(
      implicit put: Put[Column]): SQLQueryFragment

  /**
   * Where greater than or equal to.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @tparam Column Column type
   * @param sqlColumnNameOption Optional column name
   */
  protected def whereGreaterThanOrEqualTo[Column](column: Column, sqlColumnNameOption: Option[SQLColumnNameT] = None)(
      implicit put: Put[Column]): SQLQueryFragment

  /**
   * Where less than or equal to.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @tparam Column Column type
   * @param sqlColumnNameOption Optional column name
   */
  protected def whereLessThan[Column](column: Column, sqlColumnNameOption: Option[SQLColumnNameT] = None)(
      implicit put: Put[Column]): SQLQueryFragment

  /**
   * Where less than or equal to.
   *
   * @author Grumpy Cat (grumpycat@codekitt.com)
   * @tparam Column Column type
   * @param sqlColumnNameOption Optional column name
   */
  protected def whereLessThanOrEqualTo[Column](column: Column, sqlColumnNameOption: Option[SQLColumnNameT] = None)(
      implicit put: Put[Column]): SQLQueryFragment

}
