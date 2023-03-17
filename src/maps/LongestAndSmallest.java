package maps;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestAndSmallest {
    public static void LongestSmallest(String inputString){
        String[] words = inputString.split(" ");
        ArrayList<String> wordList=new ArrayList<>(Arrays.asList(words));
        String largestWord=words[0];
        String smallestWord=words[0];
        for (String word :words){
            if (word.length()>largestWord.length()){
                largestWord=word;
            }
            if (word.length()<smallestWord.length()){
                smallestWord=word;
            }
        }
        System.out.println(largestWord);
        System.out.println(smallestWord);


    }
    public static void main(String[] args){
        String str="Three mem in a team";
        LongestSmallest(str);
    }
}

//Ascending order duplicate elements - List
//Ascending order of unique elements - Set