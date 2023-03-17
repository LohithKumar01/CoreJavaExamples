package loops;

public class DebuggerExercise {
    public static void main(String[] args) {
        int sumOfNumbers = 0;
        int countOfNumbers = 0;

        for (int loopNumber = 1; loopNumber <= 100; loopNumber++) {

            if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)) {
                countOfNumbers++;
                sumOfNumbers += loopNumber;
                System.out.println("Found: " + loopNumber);
            }
            if (countOfNumbers == 5) {
                break;
            }

            System.out.println("Hi");

        }

        System.out.println("Sum: " + sumOfNumbers);
    }

}
