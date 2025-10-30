import java.util.stream.*;
import java.util.*;
public class UpperCase
{
    public static void main(String[] args) {
    
    String[] arr={"padma","pandu","kavya","josh"};
    List<String> names=Arrays.stream(arr)
    .filter(a ->a.length()>4)
    .map(String::toUpperCase)  
    .sorted()
    .collect(Collectors.toList());
    System.out.println(names);
    }
}