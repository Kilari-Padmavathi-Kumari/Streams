//Find the highest-paid employee in the company.

import java.util.*;
import java.util.stream.*;
public class HighestSalary
{
    private String name;
    private String department;
    private int salary;
    public HighestSalary(String department, String name, int salary) {
        this.department = department;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
    public String toString()
    {
        return name+" "+salary;
    }

    public static void main(String[] args) {
      List<HighestSalary> list=Arrays.asList(new HighestSalary("Cse", "josh",2200),
     new HighestSalary("Cse", "vedha",3200),new HighestSalary("EEE", "vedha",4200),new HighestSalary("EEE", "kalyan",2200),new HighestSalary("Mech", "josh",1200) ) ;
     HighestSalary ls=list.stream()
    .max(Comparator.comparingInt(HighestSalary::getSalary))
                                                                                                                                    //  .min(Comparator.comparingInt(HighestSalary::getSalary))
     .get();
     System.err.println(ls);
     


    }

}