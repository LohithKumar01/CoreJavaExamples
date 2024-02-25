package basics.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();             //NO duplicate elements in set.

        set.add(12);
        set.add(56);
        set.add(34);
        set.add(6);
        set.add(34);            //duplicates eliminated
        set.add(6);             //duplicates eliminated
        set.add(17);

        Iterator<Integer> integerIterator = set.iterator();             //Iterator should be used to iterate the next value.
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }

        System.out.println("Set has the provided value: " + set.contains(34));

        System.out.println("Size of the set: " + set.size());

    }
}
