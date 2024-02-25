package basics.examples;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int number = 3;
        int result = 1;
        for (int i=number; i>=1; i--){
            result = result * i;
        }
        System.out.println("Factorial :" + result);
    }
}
