package basics.methods;

public class MethodExercise {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tony",highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Lohith",highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateHighScorePosition(120);
        displayHighScorePosition("Kim",highScorePosition);

        isPrime(17);
    }
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000){
            return 1;
        }
        else if ((playerScore >= 500) && (playerScore < 1000)) {
            return 2;
        }
        else if ((playerScore >= 100) && (playerScore < 500)) {
            return 3;
        }
        else {
            return 4;
        }
    }
    private static void isPrime(int number) {
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
