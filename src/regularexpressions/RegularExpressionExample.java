package regularexpressions;

public class RegularExpressionExample {
    public static void main(String[] args) {
        String challenge1="I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));
        String challenge2="I want a ball.";
        System.out.println(challenge2.matches("I want a ball."));
        String regEx="I want a (bike|ball).";
        System.out.println(challenge1.matches(regEx));
        System.out.println(challenge2.matches(regEx));
    }
}
