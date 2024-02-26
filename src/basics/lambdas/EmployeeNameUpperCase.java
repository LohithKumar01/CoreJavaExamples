package basics.lambdas;


import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

import static java.lang.System.out;

public class EmployeeNameUpperCase {
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new Employee("Joe","IT"),
                new Employee("Patrick","Sales"),
                new Employee("Tony","Finance"),
                new Employee("Amber","IT"),
                new Employee("Brady",null)
        );
        employeeList.stream().map(employee -> {
            employee.setEmployeeName(employee.getEmployeeName().toUpperCase());     //for Map we need to return each element and collect it with collectors.
            return employee;
        }).collect(Collectors.toList());

        employeeList.stream().forEach(employee -> {
            employee.setEmployeeName(employee.getEmployeeName().toUpperCase());
            employee.setDepartmentName(employee.getDepartmentName() == null ? "" : employee.getDepartmentName().toUpperCase()); //If a department name is set to null it shows null pointer exception. we are setting an empty value if the departmentname is null.
        });

        employeeList.stream().forEach(System.out::println);         //Printing each iterated element.

        Map<String, List<Employee>> groupingDepartment = employeeList.stream()
                        .collect(Collectors.groupingBy(employee -> employee.departmentName));          //Grouping by department name.

        out.println(employeeList);
        out.println(groupingDepartment);
    }
}
