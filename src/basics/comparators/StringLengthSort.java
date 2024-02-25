package basics.comparators;

import java.util.Arrays;
import java.util.List;

public class StringLengthSort {
    public static void main(String[] args) {                                    //Arrays should be represented in {}
        String[] strings = {"ab", "abc", "b", "bgi","because"};               //To reverse we can use as opposite objects i.e, o2.length - 01.length
        Arrays.sort(strings,new StringComparator());
        for (String string : strings) {
            System.out.println(string);
        }
        List<String> list = Arrays.asList(strings);                         // .asList is used to convert string to list.
        System.out.println(list);
    }
}
