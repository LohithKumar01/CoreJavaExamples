package basics.examples;

public class BMI {
    public static void main(String[] args) {
        double weight = 140;
        double height = 6.00;
        double bmi = weight / (height * height);
        System.out.println("The Body Mass Index(BMI) is " + bmi);

    }
}
