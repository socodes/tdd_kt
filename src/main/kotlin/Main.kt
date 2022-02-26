import junit.framework.Assert.assertEquals
import org.junit.Test

class CalculatorTest {
    @Test
    //testing multiplying operation.
    fun testMultiply2By2(){
        val calculator = Calculator()
        val result = calculator.parse("2 * 2")
        assertEquals(4,result)
    }
    @Test
    //testing divide operation
    fun testDivide2By2(){
        val calculator = Calculator()
        val result = calculator.parse("2 / 2")
        assertEquals(1,result)
    }
    @Test
    //testing adding operation
    fun testPlus2By2(){
        val calculator = Calculator()
        val result = calculator.parse("2 + 2")
        assertEquals(4,result)
    }
    @Test
    //testing substraction operation
    fun testMinus2By2(){
        val calculator = Calculator()
        val result = calculator.parse("2 - 2")
        assertEquals(0,result)
    }
    @Test
    //testing greatest common divisor operation
    fun testGCD81and153(){
        val calculator = Calculator()
        val result = calculator.parse("81 g 153")
        assertEquals(9,result)
    }
}