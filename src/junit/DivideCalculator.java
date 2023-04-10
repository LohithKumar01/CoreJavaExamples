package junit;

public class DivideCalculator {
    public static int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new RuntimeException("Invalid Denominator");
        }
        return numerator / denominator;
    }
}
