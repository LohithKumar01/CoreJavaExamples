package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaExample {
    public static void main(String[] args) {
//        new Thread(()->{
//            System.out.println("Hi,");
//        }).start();
        Employee joe=new Employee("Joe Goldberg",25);
        Employee john=new Employee("John Blaze",30);
        Employee tim=new Employee("Tom Holland",20);
        Employee robert=new Employee("Robert Downey",48);
        Employee chris=new Employee("Chris Evans",38);
        Employee paul=new Employee("Paul Rudd",32);
        Employee cassie=new Employee("Cassie Ruth",23);

        List<Employee>employees=new ArrayList<>();
        employees.add(joe);
        employees.add(john);
        employees.add(tim);
        employees.add(robert);
        employees.add(chris);
        employees.add(paul);
        employees.add(cassie);

        Function<Employee,String>upperCase= employee -> employee.getEmployeeName().toUpperCase();
        Function<String,String>firstName=name->name.substring(0,name.indexOf(' '));
        Function chainedFunction=upperCase.andThen(firstName);
        System.out.println(chainedFunction.apply(employees.get(0)));
        System.out.println("------------------");

        System.out.println("Employees over 25");
        System.out.println("------------------");
        employees.forEach(employee -> {
            if (employee.getAge()>25){
                System.out.println(employee.getEmployeeName()+" "+employee.getAge());
            }
        });

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return 0;
//            }
//        });
//        for (Employee employee:employees) {
//            if (employee.getAge() > 25) {
//                System.out.println(employee.getEmployeeName()+" "+employee.getAge());
//            }
//        }
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
