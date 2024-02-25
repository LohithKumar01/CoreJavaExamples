package basics.methods;

public class MethodOverloadingExample {
    public static void main(String[] args) {

        System.out.println("The Area of rectangle is " + calculateArea(2,5));
        System.out.println("The Area of circle is " + calculateArea(5.50));
        MethodOverloadingExample methodOverloadingExample= new MethodOverloadingExample();
        System.out.println("The Area of square is " + methodOverloadingExample.calculateArea(5));
        System.out.println("The Area of triangle is " + calculateArea(10.0d,5.0));

    }

    public float calculateArea(float side){
        return (side * side);
    }

    public static int calculateArea(int length, int width){
        return (length * width);
    }

    public static double calculateArea(double base, double height){
        return (0.5 * (base * height));
    }

    public static double calculateArea(double radius){
        return (Math.PI * (radius * radius));
    }
}
