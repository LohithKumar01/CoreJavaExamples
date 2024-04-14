package basics.examples;

import java.util.Scanner;

//Write a Java program to calculate the final grade of a student based on their exam scores and attendance. Prompt the user to
//enter the exam scores (out of 100) and the number of classes attended (out of total classes). Assume the final grade
//is calculated as follows: 60% of the average exam score + 40% of the attendance percentage.
public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Exam 1 Score out of 100: ");
        int firstExamScore = scanner.nextInt();

        System.out.println("Enter Exam 2 Score out of 100: ");
        int secondExamScore = scanner.nextInt();

        System.out.println("Enter Attended Classes: ");
        int attendedClasses = scanner.nextInt();

        System.out.println("Enter Total Number of Classes: ");
        int totalClasses = scanner.nextInt();

        double avgExamScore = (firstExamScore + secondExamScore)/2.0;
        double attendedClassPercentage = (double) attendedClasses/totalClasses * 100;

        double finalGrade = 0.6 * avgExamScore + 0.4 * attendedClassPercentage;

        System.out.println("The Final Grade is: " + finalGrade);

        scanner.close();
    }
}
