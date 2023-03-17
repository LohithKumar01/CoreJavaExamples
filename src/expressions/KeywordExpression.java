package expressions;

public class KeywordExpression {
    public static void main(String[] args) {
//        int health =25;   //Keyword and Expression
//        int highScore=80;
//        if((health<100) && (highScore>75)){
//            System.out.println("Keyword and Expression is valid");
//        }

        //CHALLENGE
        int score=10000;
        boolean gameOver=true;
        int levelCompleted=8;
        int bonus=200;
        int finalScore=score;
        if (gameOver){
            finalScore +=(levelCompleted*bonus);
            System.out.println("The Final Score is " +finalScore);
        }


    }
}
