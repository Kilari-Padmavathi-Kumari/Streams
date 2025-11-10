//You have a list of departments, each containing a list of employees. Find all unique employee names across all departments.
import java.util.*;
import java.util.stream.*;


 class Employee 
 {
        private String name;
        private String department;
        private double salary;
        private int yearsOfExperience;

        public Employee(String name, String department, double salary, int yearsOfExperience) {
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.yearsOfExperience = yearsOfExperience;
        }

        public String getName() 
        {
             return name; 
        }
    }

     public class Department {
        private String name;
        private List<Employee> employees;

        public Department(String name, List<Employee> employees) {
            this.name = name;
            this.employees = employees;
        }

        public List<Employee> getEmployees() 
        {
            return employees;
        }
    

    public static void main(String[] args) {
        Department engineering = new Department("Engineering", Arrays.asList(
            new Employee("Padma", "Engineering", 70000, 4),
            new Employee("Joe", "Engineering", 50000, 3),
             new Employee("Padma", "Engineering", 60000, 5),
              new Employee("Padma", "Engineering", 70000, 3)
        ));
        Department hr = new Department("HR", Arrays.asList(
            new Employee("Joe", "HR", 45000, 2),
             new Employee("Joe", "HR", 45000, 2),
              new Employee("kavya", "HR", 45000, 2),
            new Employee("Vedha", "HR", 55000, 5)
        ));

        List<Department> departments = Arrays.asList(engineering, hr);

        List<String> uniqueNames = departments.stream()
            .flatMap(d -> d.getEmployees().stream())   // flatten employee lists
            .map(Employee::getName)
            .distinct()                                // remove duplicates
            .collect(Collectors.toList());

        System.out.println(uniqueNames);
    }
}

