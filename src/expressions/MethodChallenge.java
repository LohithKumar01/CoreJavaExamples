package expressions;

public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Jim",2);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName+ " managed to get into position " +playerPosition +" on the high-score list.");
    }
}
