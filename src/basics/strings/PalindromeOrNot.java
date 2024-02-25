package basics.strings;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String originalString = "abab";

        StringBuilder reverseString = new StringBuilder(originalString);
        String reverseStr = reverseString.reverse().toString();

        if(reverseStr.equals(originalString)){
            System.out.println("Palindrome");
        }else{
            System.out.println("NOT A Palindrome");
        }

    }
}