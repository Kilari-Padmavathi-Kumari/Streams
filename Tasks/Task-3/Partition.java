//Partition employees into two lists — those earning above 50k and below.


import java.util.*;
import java.util.stream.*;
public class Partition
{
    private String name;
    private String department;
    private int salary;
    public Partition(String department, String name, int salary) {
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
      List<Partition> list=Arrays.asList(new Partition("Cse", "josh",50000),
     new Partition("Cse", "vedha",52000),new Partition("EEE", "vedha",42000),new Partition("EEE", "kalyan",62000),new Partition("Mech", "josh",32000) ) ;
      Map<Boolean,List<Partition>> ls=list.stream()
      .collect(Collectors.partitioningBy(s->s.salary>=50000));
      System.err.println(ls);


    }

}