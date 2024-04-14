package basics.arrays;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
//        int num = 10;
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i<=num;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
