package basics.strings;

import java.util.Arrays;

public class AnagramOfStringOrNot {
    public static void main(String[] args) {
        String firstString = "listen";
        String secondString = "silent";
        if (firstString.length()!=secondString.length()){
            System.out.println("Not Anagram");
        }
        else{
            System.out.println("Anagram");
        }


    }
}
