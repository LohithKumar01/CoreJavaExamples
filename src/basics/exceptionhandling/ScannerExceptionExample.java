package basics.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        try{
            int number = scanner.nextInt();
            System.out.println("The Number is: " + number);
        }catch (Exception e){
            e.printStackTrace();
            if (e instanceof InputMismatchException){               //instanceof is used to check object belongs to a class.
                System.out.println("Input Mismatch");
            }
            System.out.println("SORRY, Please enter a valid number.");
        }
    }
}
