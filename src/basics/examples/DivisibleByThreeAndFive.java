package basics.examples;

public class DivisibleByThreeAndFive {
    public static void main(String[] args) {
        int number = 15;
        if ((number % 3 == 0) && (number % 5 == 0)){
            System.out.println(number + " is divisible by both 3 and 5.");
        }
        else {
            System.out.println(number + " not divisible by both 3 and 5.");
        }
    }
}
