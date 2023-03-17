package loops;

public class BreakExample {
    public static void main(String[] args) {

        for (int loopNumber = 1; loopNumber <= 10; loopNumber++) {

            System.out.println("Before" + loopNumber);

            if (loopNumber == 5) {
                continue;
            }

            System.out.println("After" + loopNumber);

        }

        System.out.println("out of loop ");
    }

}
