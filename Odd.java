import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;
public class Odd
{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(3,4,22,4,5,21,1);
        /*list.stream()
        .filter(n->n%2==1)
        .forEach(System.out::println);*/

       
    List<Integer> oddNumbers = list.stream()
    .filter(n -> n % 2 != 0)
    .collect(Collectors.toList());
    System.out.println("Odd Numbers: " + oddNumbers);

System.out.println("reverse order : ");
    List<Integer> num=list.stream() 
    .distinct()
    .sorted(Comparator.reverseOrder())
    .collect(Collectors.toList());
    System.out.print(num);
    //.forEach(System.out::println);

    }
}