package basics.comparators;

import java.util.ArrayList;
import java.util.Arrays;

public class ComparatorExample {
    public static void main(String[] args) {
        Student[] studentList = {                                   //Creating student objects using constructors with new keyword.
                new Student(1,"John",19),
                new Student(3,"Patrick",21),
                new Student(2,"Joe",20),
        };
        Arrays.sort(studentList,new AgeComparator());               //We should import comparator as new object with new keyword everytime.

        for (Student student : studentList) {                       //by doing Student.for we will get the for-each loop created.
            System.out.println(student);
        }
    }
}
