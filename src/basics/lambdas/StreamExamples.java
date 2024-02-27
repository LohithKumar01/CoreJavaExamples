package basics.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(51, 22, 34, 74, 15, 8, 170, 91, 99);
        List<String> namesList = Arrays.asList("Joe", "John", "Stark", "Ava", "Tom", "Mark", "Steven");

        List<Integer> evenNumbers = numberList.stream()
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());

        Optional<Integer> maxNumber = numberList.stream()
                        .max(Integer::compareTo);

        List<String> sortedList = namesList.stream()
                        .sorted()
                        .collect(Collectors.toList());

        List<String> upperCaseList = namesList.stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());

        Map<Character, List<String> > groupingByLetter = namesList.stream()
                        .collect(Collectors.groupingBy(s -> s.charAt(0)));

        int sum = numberList.stream()
                        .reduce(0, Integer::sum);           //reduce is used for sum

        System.out.println(evenNumbers);
        System.out.println(numberList.stream().count());
        System.out.println(maxNumber);
        System.out.println(sortedList);             //SortedList
        System.out.println(upperCaseList);          //UpperCase by insertion order.
        System.out.println(groupingByLetter);
        System.out.println(sum);
    }

}
