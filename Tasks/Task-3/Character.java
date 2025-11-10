//Find the names of employees whose names start with “A”.

import java.lang.reflect.Array;
import java.util.*;
import java.util.logging.Filter;
import java.util.stream.*;
public class Character
{
    private String name;
    private String department;
    private int salary;
    public Character(String department, String name, int salary) {
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
        return name;
    }

    public static void main(String[] args) {
      List<Character> list=Arrays.asList(new Character("Cse", "josh",2200),
     new Character("Cse", "ammu",3200),new Character("EEE", "aarthi",4200),new Character("EEE", "kalyan",2200),new Character("Mech", "josh",1200) ) ;
      List<Character> ls=list.stream()
     .filter(s->s.getName().startsWith("a"))
     .collect(Collectors.toList());
    System.err.println(ls);

    }

}