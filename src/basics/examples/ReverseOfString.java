package basics.examples;

public class ReverseOfString {
    public static void main(String[] args) {
        String originalString = "Lohith";
        String reverseString = "";
        char character;
        int i=originalString.length()-1;            //Initialize the variable
        while (i>=0){                               //Condition
            character = originalString.charAt(i);
            reverseString=reverseString + character;
            i--;
        }
//        for (int i = originalString.length()-1; i>= 0;i--){
//            character = originalString.charAt(i);
//            reverseString = reverseString + character;
//        }
        System.out.println(reverseString);
    }
}
