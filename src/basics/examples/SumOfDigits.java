package basics.examples;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 217, eachDigit, sum = 0;
        while (number > 0){
            eachDigit = number % 10;
            sum += eachDigit;
            number /= 10;
        }
        System.out.println("Sum is " + sum);
    }

}
