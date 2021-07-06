import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    double result;
    Calculator calculator = new Calculator();

    @Test
    void sum() {
        result = calculator.sum(7, 3);
        assertEquals(10, result);

        result = calculator.sum(-4, 5);
        assertEquals(1, result);

        result = calculator.sum(4.1, 5.9);
        assertEquals(10, result);
    }

    @Test
    void sub() {
        result = calculator.sub(7, 3);
        assertEquals(4, result);
    }

    @Test
    void mul() {
        result = calculator.mul(7, 3);
        assertEquals(21, result);
    }

    @Test
    void div() {
        result = calculator.div(21, 3);
        assertEquals(7, result);
    }

}
