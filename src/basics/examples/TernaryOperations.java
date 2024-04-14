package basics.examples;

public class TernaryOperations {
    public static void main(String[] args) {
        int number = -10;
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println("The given number "+ number+" is " + result);
    }
}
