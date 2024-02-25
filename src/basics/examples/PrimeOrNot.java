package basics.examples;

public class PrimeOrNot {
    public static void main(String[] args) {
        int number = 12;
        boolean notAPrimeNumber = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a Prime Number.");
                notAPrimeNumber = true;
                break;
            }
        }
        if (!notAPrimeNumber) {
            System.out.println(number + " is Prime.");
        }
    }
}

