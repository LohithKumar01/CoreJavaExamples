package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNumbers {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> square = number.stream().map(n -> n * n).collect(Collectors.toList());

        List<Integer> evenNumbers = number.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        number.stream().map(n -> n + 1).forEach(System.out::println);

        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Squares of Numbers: " + square);

    }
}
