import java.util.*;
import java.util.stream.Collectors;
public class Reverse
{
    public static void main(String[] args) {
        List<Integer> list=List.of(1,3,4,7,8,6,9,5,2);
        list.stream()
        .filter(lists -> lists%2==0)
        .sorted()
       
       // .sorted(Comparator.reverseOrder())
        .forEach(System.out::println);


        List<Integer> list1=List.of(1,3,4,7,8,6,9,5,2);
        List<Integer> collect=list1.stream()
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
        System.err.println(collect);





    }
}