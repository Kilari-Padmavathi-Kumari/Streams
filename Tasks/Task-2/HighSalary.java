//Given a list of employees, find all employees from "Engineering" department with salary > 50000, and return their names in uppercase

import java.util.*;
import java.util.stream.*;
public class HighSalary
{
    private String name;
    private int salary;
    private String dep;
    private int yearsofExp;
   
    public HighSalary(String dep, String name, int salary,int yearsofExp) {
        this.dep = dep;
        this.name = name;
        this.salary = salary;
        this.yearsofExp=yearsofExp;
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

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public static void main(String[] args) {
        List<HighSalary> list=List.of(new HighSalary("Engineering","padma",50000,3),
        new HighSalary("Engineering","josh",40000,2),
        new HighSalary("Engineering","kavya",55000,5),
        new HighSalary("Engineering","vedha",53000,1),
        new HighSalary("Computer","kutti",45000,6));

        List<String> name=list.stream()
        .filter(e->e.getDep().equalsIgnoreCase("Engineering"))
        .filter(e->e.getSalary()>50000)
        .map(e->e.getName().toUpperCase())
        .collect(Collectors.toList());
        System.err.println(name);

         }
}