import java.util.stream.*;
import java.util.*;
public class LongestSmallestString
{
    public static void main(String[] args) {
        System.err.println("largest String");
     List<String> list=Arrays.asList("padma","joe","vedha");
     String str=list.stream()
     .max(Comparator.comparingInt(String::length))
     .get();
     
     System.out.println(str);

    System.err.println("smallest String");
     List<String> list1=Arrays.asList("padma","joe","vedha");
      String str1=list1.stream()
     .min(Comparator.comparingInt(String::length))
     .get();
     
     System.out.println(str1);
     
    
    }
}