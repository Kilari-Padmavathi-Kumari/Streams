import java.util.*;
public class Reverse
{
    public static void main(String[] args) {
        List<Integer> list=List.of(1,3,4,7,8,6,9,5,2);
        list.stream()
        .filter(lists -> lists%2==0)
        .sorted().peek(System.out::println)
       
       // .sorted(Comparator.reverseOrder())
        .forEach(System.out::println);


    }
}