package basics.comparators;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {            //Comparator with Student object inside. We have to implement method.

    @Override
    public int compare(Student o1, Student o2) {                    //we are comparing with sorted name order.
        return o1.getName().compareTo(o2.getName());
    }
}
