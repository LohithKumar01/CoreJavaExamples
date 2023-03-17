package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("Hi,");
        }).start();
        Employee joe=new Employee("Joe Goldberg",25);
        Employee john=new Employee("John Blaze",30);
        Employee tim=new Employee("Tim",25);
        Employee dan=new Employee("Dan Woo",28);

        List<Employee>employees=new ArrayList<>();
        employees.add(joe);
        employees.add(john);
        employees.add(tim);
        employees.add(dan);
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
            }
        });
        for (Employee employee:employees){
            System.out.println(employee.getEmployeeName());
        }
    }

}
class Employee{
    private String employeeName;
    private int age;

    public Employee(String employeeName, int age) {
        this.employeeName = employeeName;
        this.age = age;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
