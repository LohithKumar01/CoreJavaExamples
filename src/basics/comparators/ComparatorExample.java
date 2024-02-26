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

//        Arrays.sort(studentList, (o1, o2) -> o1.getName().length()- o2.getName().length());
//        Arrays.sort(studentList, (o1, o2) -> o1.getAge()- o2.getAge());     //We can use the lambda expression rather than creating a separate class comparator.

        for (Student student : studentList) {                       //by doing Student.for we will get the for-each loop created.
            System.out.println(student);
        }
    }
}
