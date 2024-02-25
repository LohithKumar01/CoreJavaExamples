package basics.arrays;

import java.util.Arrays;

public class ArrayPalindrome {
        public static void main(String[] args) {
            int[] firstArray = {1, 2, 3, 2, 1};
            System.out.println(isPalindrome(firstArray));
        }

        public static String isPalindrome(int[] checkArray) {
            int fromLeft = 0;
            int fromRight = checkArray.length - 1;

            while (fromLeft < fromRight) {
                if (checkArray[fromLeft] != checkArray[fromRight]) {
                    return "is not Palindrome.";
                }
                fromLeft++;
                fromRight--;
            }
            return "is Palindrome.";
        }
    }

