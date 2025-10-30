import java.util.*;
import java.util.stream.*;
public class Limit
{
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,5,4,4,3,3,2,1,1,8,8);
        //list.stream()
        //.forEach(System.out::println);

        System.err.println("after removing duplicates");
         list.stream()
        .distinct()
       .forEach(System.out::println);

        System.err.println("using limit");
         list.stream()
        .limit(3)
        .forEach(System.out::println);
    }
}