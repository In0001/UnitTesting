import java.util.ArrayList;
import java.util.List;

public class QuadraticEquationSolver {
    public List<Double> result(double a, double b, double c) throws Exception {
        if (a == 0) {
            throw new Error("Это не квадратное уравнение") ;
        }
        List<Double> result = new ArrayList<>();
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            result.add(x1);
            result.add(x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            result.add(x);
        }
        return result;
    }
}
