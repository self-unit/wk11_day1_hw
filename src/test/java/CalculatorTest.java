import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before() {
        calculator = new Calculator(5,3);
    }

    @Test
    public void canAdd() {
        assertEquals(8, calculator.add());
    }
    @Test
    public void canSubtract() {
        assertEquals(2, calculator.subtract());
    }
    @Test
    public void canMultiply() {
        assertEquals(15, calculator.multiply());
    }
    @Test
    public void canDivide() {
        assertEquals(1.67, calculator.divide(), 0.01);
    }
}
