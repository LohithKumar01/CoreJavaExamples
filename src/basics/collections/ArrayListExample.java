package basics.collections;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        String stringElements = "xy ba ca da ab ba ea fa";
        String[] stringTokens = stringElements.split(" ");
        System.out.println(Arrays.toString(stringTokens));

        Map<String, Integer> elementsMap = new LinkedHashMap<>();               //naming conventions for map should be map after name.

        for (String element : stringTokens){
//        for (int i = 0; i < stringTokens.length; i++){
//            String element = stringTokens[i];
            if (elementsMap.containsKey(element)){
                elementsMap.put(element,elementsMap.get(element)+1);
            }
            else {
                elementsMap.put(element,1);
            }
        }
        System.out.println(elementsMap);

    }
}
