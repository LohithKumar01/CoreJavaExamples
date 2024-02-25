package basics.comparators;

import java.util.Comparator;

public class Student {
        int id;
        String name;
        int age;

    public Student(int id, String name, int age) {                  //constructors
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {                                            //getters and setters
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override                                               //toString()
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
