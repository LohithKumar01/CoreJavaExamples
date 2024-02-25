package basics.strings;

import java.util.StringTokenizer;

public class CapitalizingFirstLetterInSentence {
    public static void main(String[] args) {
        String sentence = "I won a first prize.";
        StringTokenizer stringTokenizer = new StringTokenizer(sentence," ");
        while (stringTokenizer.hasMoreTokens()){
            String token = stringTokenizer.nextToken();
            System.out.print(" ");
            if (token.length()>1){
                String capitalizedFirstLetter = token.substring(0,1).toUpperCase() + token.substring(1);
                System.out.print(capitalizedFirstLetter);
            }else{
                System.out.print(token.toUpperCase());
            }

        }

    }
}
