
import java.util.*;
import java.util.stream.*;
public class Print{
   private String name;
   private int age;

    public Print(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString()
    {
        return name+" "+age;

    }
    public static void main(String[] args) {
        
    

    List<Print> list=Arrays.asList(new Print(23,"padma"),
    new Print(22,"kavya"),new Print(25,"josh"));

     list.stream()
     .forEach(student->System.err.println(student));

      System.err.println("sorted the order");
      list.stream()
      //.sorted((a,b) ->Integer.compare(a.age,b.age))
      .sorted((Comparator.comparing((Print s) -> s.name)).reversed())  //.sorted((Comparator.comparing((s) -> s.name)).reversed()) we srite this stream treated s is object si=o error occurs
      .forEach(student->System.err.println(student));
   
}
}