
import java.util.*;
import java.util.stream.*;
public class HighString
{
    public static void main(String[] args) {
       
    List<String> list=List.of("padma","josh","jk");
       list.stream()
       .sorted(Comparator.comparingInt(String::length).reversed())
        .forEach(System.out::println);
    


    
           
    }

}