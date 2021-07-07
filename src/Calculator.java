public class Calculator {
    public double sum(double number1, double number2) {
        return number1 + number2;
    }

    public double sub(double number1, double number2) {
        return number1 - number2;
    }

    public double mul(double number1, double number2) {
        return number1 * number2;
    }

    public double div(double number1, double number2) {
        if (number2 == 0)
            throw new ArithmeticException("Делить на ноль нельзя");
        return number1 / number2;
    }
}
