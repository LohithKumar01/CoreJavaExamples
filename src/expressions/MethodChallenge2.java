package expressions;

public class MethodChallenge2 {
    public static void main(String[] args) {
        calculateHighScorePosition(125);

    }
    static void calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            System.out.println("1");
        }
        else if (playerScore >= 500){
            System.out.println("2");
        }

        else if (playerScore >= 100) {
            System.out.println("3");
        }
        else {
            System.out.println("4");
        }
    }

}
