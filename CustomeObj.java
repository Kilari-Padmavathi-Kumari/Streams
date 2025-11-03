import java.util.*;
import java.util.stream.*;
public class CustomeObj
{
    private String name;
    private int age;
    CustomeObj(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String toString()
    {
        return name+" "+age;
    }
     public static void main(String[] args)
     {
        List<CustomeObj> list=new ArrayList<>();
        list.add(new CustomeObj("padma",23));
         list.add(new CustomeObj("kavya",22));
          list.add(new CustomeObj("josh",21));
          System.err.println("Stream list ");
          list.stream()
          .forEach(System.out::println);
 
        System.err.println("orted the data");
          list.stream()
         // .sorted(Comparator.comparing((CustomeObj s) ->s.age).reversed())
          .sorted((s1,s2) -> Integer.compare(s2.age,s1.age))
          .forEach(System.out::println);

        System.err.println("get age greater than 22");
          list.stream()
          .filter(s -> s.age>22)
          .forEach(System.out::println);
     }
}