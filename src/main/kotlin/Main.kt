import junit.framework.Assert.assertEquals
import org.junit.Test

class CalculatorTest {
    @Test
    fun testMultiply2By2(){
        val calculator = Calculator()
        val result = calculator.parse("2 * 2")
        assertEquals(4,result)
    }
    @Test
    fun testDivide2By2(){
        val calculator = Calculator()
        val result = calculator.parse("2 / 2")
        assertEquals(1,result)
    }
    @Test
    fun testPlus2By2(){
        val calculator = Calculator()
        val result = calculator.parse("2 + 2")
        assertEquals(4,result)
    }
    @Test
    fun testMinus2By2(){
        val calculator = Calculator()
        val result = calculator.parse("2 - 2")
        assertEquals(0,result)
    }
    @Test
    fun testGCD81and153(){
        val calculator = Calculator()
        val result = calculator.parse("81 g 153")
        assertEquals(9,result)
    }
}