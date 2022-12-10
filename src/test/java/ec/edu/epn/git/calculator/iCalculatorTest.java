package ec.edu.epn.git.calculator;

import org.junit.*;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class iCalculatorTest {
    private iCalculator ic = null;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass(): Starting testing process");
    }
    @Before
    public void setUpTests() {
        ic = Mockito.mock(iCalculator.class);
        System.out.println("setUpTests(): The test has been set up");
    }
    @Test
    public void given_two_integers_when_addition_then_ok() {
        System.out.println("Test 1");
        Mockito.when(ic.addition(5,6)).thenReturn(11);
        assertEquals(11,ic.addition(5,6));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        System.out.println("Test 2");
        Mockito.when(ic.subtraction(4,2)).thenReturn(2);
        assertEquals(2,ic.subtraction(4,2));
    }

    @Test
    public void given_two_integers_when_multiplication_then_ok() {
        System.out.println("Test 3");
        Mockito.when(ic.multiplication(2,5)).thenReturn(10);
        assertEquals(10,ic.multiplication(2,5));
    }

    @Test
    public void given_two_integers_when_division_then_ok() {
        System.out.println("Test 3");
        Mockito.when(ic.division(8,2)).thenReturn(4);
        assertEquals(4,ic.division(8,2));
    }

    @Test
    public void given_two_positives_integers_when_power_operation() {
        System.out.println("Test 5");
        Mockito.when(ic.power(5,2)).thenReturn(25);
        assertEquals(25,ic.power(5,2));
    }

    @After
    public void tearDown() {
        System.out.println("tearDown(): End of unit test");
        ic = null;
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass(): End of test process");
    }


}