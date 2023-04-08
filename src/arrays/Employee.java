package arrays;

import compare.EmpNameComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Employee { //} implements  Comparable<Employee>{
    private String employeeName;
    private Integer employeeSalary;
    public Employee(String employeeName, int employeeSalary) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Integer employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Employee>employeeList= new ArrayList<Employee>();
        employeeList.add(new Employee("John Moore",30000));
        employeeList.add(new Employee("Tony Stark",30000));
        employeeList.add(new Employee("John Wick",80000));
        employeeList.add(new Employee("Tim Smith",45000));
        employeeList.add(new Employee("Joe Goldberg",25000));
        Collections.sort(employeeList,new EmpNameComparator());
        for (Employee employee:employeeList){
            System.out.println(employee);
        }
    }

//    @Override
//    public int compareTo(Employee employee) {
//        return this.getEmployeeSalary() - employee.getEmployeeSalary();
//    }
}
