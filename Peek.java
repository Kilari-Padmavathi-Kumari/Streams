import java.sql.Array;
import java.util.*;
import java.util.stream.*;
public class Peek
{
    public static void main(String[] args) {
        String[] str={"padma","kavya","josh"};
        
        System.err.println("ele convert uppercase");
         Arrays.stream(str)
        .map(String::toUpperCase)
        .forEach(System.out::println);

        Arrays.stream(str)
        .peek(n -> System.err.println(" peek ele"))
        .forEach(System.out::println);

    }
}