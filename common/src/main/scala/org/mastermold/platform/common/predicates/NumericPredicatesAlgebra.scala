package org.mastermold.platform.common.predicates

/**
 * Numeric predicates algebra.
 *
 * @author Grumpy Cat (grumpycat@codekitt.com)
 * @tparam N Numeric type
 */
trait NumericPredicatesAlgebra[N] {
        
    /**
     * Check if left value is greater than right.
     *
     * @author Grumpy Cat (grumpycat@codekitt.com)
     * @param valueLeft Left value 
     * @param valueRight Right value 
     */
    def isGreaterThan(valueLeft: N, valueRight: N): Boolean

    /**
      * Check if left value is greater than or equal to right.
      *
      * @author Grumpy Cat (grumpycat@codekitt.com)
      * @param valueLeft Left value
      * @param valueRight Right value
      */
    def isGreaterThanOrEqualTo(valueLeft: N, valueRight: N): Boolean
     
    /**
     * Check if left value is equal than right.
     *
     * @author Grumpy Cat (grumpycat@codekitt.com)
     * @param valueLeft Left value 
     * @param valueRight Right value 
     */
    def isEqualTo(valueLeft: N, valueRight: N): Boolean
    
    /**
     * Check if left value is less than right
     *
     * @author Grumpy Cat (grumpycat@codekitt.com)
     * @param valueLeft Left value 
     * @param valueRight Right value 
     */
    def isLessThan(valueLeft: N, valueRight: N): Boolean


    /**
      * Check if left value is less than or equal to right.
      *
      * @author Grumpy Cat (grumpycat@codekitt.com)
      * @param valueLeft Left value
      * @param valueRight Right value
      */
    def isLessThanOrEqualTo(valueLeft: N, valueRight: N): Boolean

}