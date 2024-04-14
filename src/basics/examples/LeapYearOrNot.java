package basics.examples;

public class LeapYearOrNot {
    public static void main(String[] args) {
        int year = 2024;
        if (year % 4 == 0){
            System.out.println(year + " is a Leap Year.");
        }else {
            System.out.println("Not a Leap Year.");
        }
    }
}
