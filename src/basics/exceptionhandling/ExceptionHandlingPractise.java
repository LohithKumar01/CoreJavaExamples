package basics.exceptionhandling;

public class ExceptionHandlingPractise {
    public static void main(String[] args) {
        int x = 6;
        int y = 0;
        try {
            System.out.println(x/y);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Can't divide it by zero.");      //e.getMessage() Can throw any exception.
//            System.out.println("Can't divide it by zero.");
        }

    }
}
