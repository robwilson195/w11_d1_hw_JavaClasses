import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        int expected = 6;
        assertEquals(expected, calculator.add(4,2));
    }

    @Test
    public void canSubtract() {
        int expected = 9;
        assertEquals(expected, calculator.subtract(15, 6));
    }

    @Test
    public void canMultiply() {
        int expected = 24;
        assertEquals(expected, calculator.multiply(6, 4));
    }

    @Test
    public void canDivide() {
        int expected = 3;
        assertEquals(expected, calculator.divide(9, 3));
    }

}
