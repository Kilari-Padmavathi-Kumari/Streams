//Given a list of employees (with fields: name, department, salary), group them by department and
// counthow many employees are in each department. In the same above list do this above tasks


import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;
public class Grouping
{
    private String name;
    private String department;
    private int salary;
    public Grouping(String department, String name, int salary) {
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

    public static void main(String[] args) {
      List<Grouping> list=Arrays.asList(new Grouping("Cse", "josh",2200),
     new Grouping("Cse", "vedha",3200),new Grouping("EEE", "vedha",4200),new Grouping("EEE", "kalyan",2200),new Grouping("Mech", "josh",1200) ) ;
      Map<String,Long> ls=list.stream()
      .collect(Collectors.groupingBy(c->c.getDepartment(),Collectors.counting()));    //.collect(Collectors.groupingBy(Grouping::getDepartment,Collectors.counting()));
      System.err.println(ls);


    }

}