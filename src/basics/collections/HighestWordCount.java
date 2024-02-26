package basics.collections;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class HighestWordCount{
    public static void main(String[] args) {
//        String stringElements = "tim bun kim book man tim tim tim tim kim kite parrot tim red kim tom stark tim parrot red kim kim kim kim tim man kite tim";
        String stringElements = "The cat chased the cat but the cat didn't care for the cat was determined";

        String[] stringTokens = stringElements.split(" ");
        System.out.println(Arrays.toString(stringTokens));

        String maxRepeatedWord = null;
        int maxWordCount = 0;
        Map<String, Integer> elementsMap = new LinkedHashMap<>();

        for (String element : stringTokens){
            if (elementsMap.containsKey(element)){
                elementsMap.put(element,elementsMap.get(element)+1);
            }
            else {
                elementsMap.put(element,1);
            }
        }
        System.out.println(elementsMap);
        for(Map.Entry<String, Integer> entry : elementsMap.entrySet()){             //Map.Entry is used mostly for count related tasks.
            if (entry.getValue() > maxWordCount){
                maxRepeatedWord=entry.getKey();
                maxWordCount=entry.getValue();
            }
        }
        System.out.println(maxRepeatedWord + " " + maxWordCount);
    }
}
