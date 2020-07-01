package org.mastermold.platform.common.predicates

/**
 * Long predicates algebra.
 *
 * @author Nick Odumo (nodumo@nodumo.com)
 */
trait LongPredicatesAlgebra {
        
    /**
     * Check if left value is greater than right.
     *
     * @author Nick Odumo (nodumo@nodumo.com)
     * @param valueLeft Left value 
     * @param valueRight Right value 
     */
    def isGreaterThan(valueLeft: Int, valueRight: Int): Boolean 
     
    /**
     * Check if left value is equal than right.
     *
     * @author Nick Odumo (nodumo@nodumo.com)
     * @param valueLeft Left value 
     * @param valueRight Right value 
     */
    def isEqualTo(valueLeft: Int, valueRight: Int): Boolean 
    
    /**
     * Check if left value is less than right
     *
     * @author Nick Odumo (nodumo@nodumo.com)
     * @param valueLeft Left value 
     * @param valueRight Right value 
     */
    def isLessThan(valueLeft: Int, valueRight: Int): Boolean 

}