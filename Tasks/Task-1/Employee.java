/*Given a list of employees (with fields name:String and salary:int), write a stream pipeline to find the name of the employee with the highest salary.
Sample data:
List<Employee> employees = Arrays.asList(new Employee("A", 50000), new Employee("B", 75000), new Employee("C", 62000));
Expected output: "B"*/

/*import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;
public class Employee{
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public String toString()
    {
        return name+" "+salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
     public static void main(String[] args) {
        List<Employee> list=Arrays.asList(new Employee("A", 50000), new Employee("B", 75000), new Employee("C", 62000));
    String name=list.stream()
        .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
        .map(Employee::getName)
        .findFirst()
        .get();
        System.err.println("highest salary name is :"+name);  
    }
}*/

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;
public class Employee{
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public String toString()
    {
        return name+" "+salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
     public static void main(String[] args) {
        List<Employee> list=Arrays.asList(new Employee("A", 50000), new Employee("B", 75000), new Employee("C", 62000));
    String name=list.stream()
       .max(Comparator.comparing(Employee::getSalary))
        .map(Employee::getName)
        .get();
        System.err.println("highest salary name is :"+name);  
    }
}