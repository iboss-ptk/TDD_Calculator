import org.junit.*
import org.junit.Assert.assertEquals

class CalculatorTests {

    private lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun shouldTest() {
        assertEquals("", "")
    }
}
