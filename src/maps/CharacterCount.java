package maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CharacterCount {
    public static void printUniqueWords(String inputString) {
        String[] words = inputString.toLowerCase().split(" ");
        ArrayList<String> uniqueWordsList=new ArrayList<String>();
        for (String word :words) {
            if (!uniqueWordsList.contains(word)){
                uniqueWordsList.add(word);
                System.out.println(word);
            }
        }
    }
    public static void main(String[] args)
    {
        String str = "The sun was setting over the horizon casting a warm golden glow " +
                "over the landscape A gentle breeze blew through the trees rustling the " +
                "leaves and creating a peaceful melody Birds chirped and sang their evening songs " +
                "while a distant dog barked intermittently";

        List<String> stringList = Arrays.stream(str.split(" ")).filter(word -> word.length() > 5).collect(Collectors.toList());

        stringList.forEach( word -> System.out.println(word));


//        printUniqueWords(str);
    }
}
