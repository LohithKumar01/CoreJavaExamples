package exception;

import java.util.Scanner;

public class ScannerExample{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name= scanner.nextLine();
//        System.out.println("Hi "+name+"! Welcome to this course.");
//        System.out.println("What's your age");
//        int age=scanner.nextInt();
//        System.out.println("I am "+age+" years old.");
        int counter =1;
        int sum=0;
        while(counter<=5){
            System.out.println("Enter a "+counter+" number:");
            String nextNumber= scanner.nextLine();
            try {
                int number=Integer.parseInt(nextNumber);
                counter++;
                sum+=number;

            }catch (NumberFormatException e)     //Exception due to change of format.
            {
                System.out.println("Format should be in Integer.");
            }
        }
        System.out.println("The sum of 5 numbers is "+sum);
    }
}