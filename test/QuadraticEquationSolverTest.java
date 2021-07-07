import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationSolverTest {
    QuadraticEquationSolver qes = new QuadraticEquationSolver();
    List<Double> result1 = new ArrayList<>();
    List<Double> result2 = new ArrayList<>();

    @Test
    void result1() {
        assertThrows(Error.class, () -> {
            qes.result(0, 2, 3); });
    }

    @Test
    void result2() throws Exception {
        result1 = qes.result(1, 2, 3);
        assertEquals(result2, result1);
    }

    @Test
    void result3() throws Exception {
        result1 = qes.result(2, 5, 2);
        result2.add(-0.5);
        result2.add(-2.0);
        assertEquals(result2, result1);
    }

    @Test
    void result4() throws Exception {
        result1 = qes.result(1, 2, 1);
        result2.add(-1.0);
        assertEquals(result2, result1);
    }
}