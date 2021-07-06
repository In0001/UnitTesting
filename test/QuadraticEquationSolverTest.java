import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationSolverTest {
    QuadraticEquationSolver qes = new QuadraticEquationSolver();

    @Test
    void result() {
        String result;

        result = qes.result(0,2,3);
        assertEquals("Это не квадратное уравнение", result);

        result = qes.result(1,2,3);
        assertEquals("Нет действительных корней", result);

        result = qes.result(2,5,2);
        assertEquals("-0.5, -2.0", result);

        result = qes.result(1,2,1);
        assertEquals("-1.0", result);
    }
}