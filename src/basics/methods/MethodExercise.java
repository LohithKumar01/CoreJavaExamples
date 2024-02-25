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

    }
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on high score list.");
    }

    public static int calculateHighScorePosition(int playerScore){
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
}
