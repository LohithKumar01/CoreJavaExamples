package expressions;

public class MethodOverloadingExample {
    public static void main(String[] args) {

        System.out.println("New score is " + calculateScore("Tony", 400));
        System.out.println("New score is " + calculateScore(20));
    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {

        return calculateScore("Anonymous", score);
    }
}
