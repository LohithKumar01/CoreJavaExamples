package expressions;

public class MethodCentimeterConversion {

    public static void main(String[] args) {
        System.out.println("Conversion of feet to Centimeters: "+MethodCentimeterConversion.convertToCentimeters(5,2));
        System.out.println("Conversion to Centimeters: " + convertToCentimeters(5));
        new MethodCentimeterConversion().testMethod();
    }
    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }
    public static double convertToCentimeters(int feet, int inches){
        return ((feet + 12) + inches) * 2.54;
    }

    public void testMethod(){
        System.out.println("Inside the method");
    }

}
