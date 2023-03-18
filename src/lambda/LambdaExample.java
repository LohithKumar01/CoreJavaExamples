package lambda;

import java.util.ArrayList;
import java.util.List;

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

        List<Employee>employeeList=new ArrayList<>();
        employeeList.add(joe);
        employeeList.add(john);
        employeeList.add(tim);
        employeeList.add(robert);
        employeeList.add(chris);
        employeeList.add(paul);
        employeeList.add(cassie);

        employeeList.stream().map(employee -> {employee.setAge(employee.getAge()+5); return  employee;}).forEach(emp -> System.out.println(emp));

//        Function<Employee,String>upperCase= employee -> employee.getEmployeeName().toUpperCase();
//        Function<String,String>firstName=name->name.substring(0,name.indexOf(' '));
//        Function chainedFunction=upperCase.andThen(firstName);
//        System.out.println(chainedFunction.apply(employeeList.get(0)));
//        System.out.println("------------------");

//        System.out.println("Employees over 25");
//        System.out.println("------------------");
//        employeeList.forEach(employee -> {
//            if (employee.getAge()>25){
//                System.out.println(employee.getEmployeeName()+" "+employee.getAge());
//            }
//        });

//        Collections.sort(employeeList, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return 0;
//            }
//        });
//        for (Employee employee:employeeList) {
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

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", age=" + age +
                '}';
    }
}
