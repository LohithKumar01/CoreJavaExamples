package basics.examples;

public class FibonacciExample {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println(firstNumber);
        System.out.println(secondNumber);

        for (int i = 0; i<=5-2; i++){
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            System.out.println(secondNumber);
        }
    }
}
