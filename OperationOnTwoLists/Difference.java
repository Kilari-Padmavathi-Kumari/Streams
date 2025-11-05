import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;
public class Difference
{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(3,4,22,4,5,21,1);
         List<Integer> list1=Arrays.asList(2,3,4,5,9,21,1);
         List<Integer> difference=list.stream()
         .filter(n->!list1.contains(n))
         .collect(Collectors.toList());
         System.err.println(difference);
    }
}
        