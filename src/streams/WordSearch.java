package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordSearch {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Leo", "Scarlet", "Stuart", "Bob", "Sam", "Ack");

        List<String> nameSearch = nameList.stream().filter(string -> string.startsWith("S")).collect(Collectors.toList());

        List<String> nameSort = nameList.stream().sorted().collect(Collectors.toList());

        System.out.println(nameSearch);
        System.out.println(nameSort);
    }
}
