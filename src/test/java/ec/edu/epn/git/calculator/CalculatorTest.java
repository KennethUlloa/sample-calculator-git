package ec.edu.epn.git.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator c = null;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass(): Starting testing process");
    }

    @Before
    public void setUpTests() {
        c = new Calculator();
        System.out.println("setUpTests(): The test has been set up");
    }

    @Test
    public void given_two_integers_when_addition_then_ok() {
        System.out.println("Test 1");
        assertEquals(6, c.addition(4, 2));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        System.out.println("Test 2");
        assertEquals(2, c.subtraction(4,2));
    }

    @Test
    public void given_two_integers_when_multiplication_then_ok() {
        System.out.println("Test 3");
        assertEquals(10, c.multiplication(5, 2));
    }

    @Test
    public void given_two_integers_when_division_then_ok() {
        System.out.println("Test 3");
        assertEquals(4, c.division(8, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_exception() {
        System.out.println("Test 4");
        assertEquals(3, c.division(6,0));
    }

    @After
    public void tearDown() {
        System.out.println("tearDown(): End of unit test");
        c = null;
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass(): End of test process");
    }
}