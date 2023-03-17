package expressions;

public class MethodsExample {
    public static void main(String[] args) {
        calculateScore(100,200);
    }

    public static void calculateScore(int sub1, int sub2) {
        int sum;
        sum = sub1 + sub2;
        System.out.println("The sum is "+sum);
    }
}
