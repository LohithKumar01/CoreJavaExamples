package basics.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LowerCaseListOfStrings{
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Leo");
        stringList.add("Amber");
        stringList.add("atrick");
        stringList.add("Jackie");
        stringList.add("James");
        stringList.add("Smith");

        System.out.println("The List Before Lower Case: " + stringList);

//        Given a list of Strings, convert all elements to lowercase and collect them in a new list.
        List<String> lowerCaseList = stringList.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        List<String> lengthMoreThanFive = lowerCaseList.stream()
                .filter(s -> s.length()>5)
                        .collect(Collectors.toList());

//        Find the first element in the list of elements in a list that are greater than 5.
        List<String> stringLengthGreaterThanFive = lowerCaseList.stream()
                .filter(s -> s.length()>5)
                .collect(Collectors.toList());


        System.out.println("List of Strings with Lower Case: " + lowerCaseList);
        System.out.println(lengthMoreThanFive);
        System.out.println(stringList.stream()
                        .filter(s -> s.length()>15)
                .findFirst().orElse(null));

//        Given a list of Strings, filter those starting with "A", convert them to uppercase, and print them in sorted order.

        List<String> stringSortUpperCase = stringList.stream()
                .filter(s -> s.startsWith("A")||s.startsWith("a"))
                .map(LowerCaseListOfStrings::upper)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(stringSortUpperCase);
    }
    public static String upper(String s){
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }
}
