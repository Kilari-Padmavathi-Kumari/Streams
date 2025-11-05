import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;
public class IntersectionTwoList
{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(3,4,22,4,5,21,1);
         List<Integer> list1=Arrays.asList(2,3,4,5,9,21,1);
         List<Integer> intersection=list.stream()
         .filter(list1::contains)
         .collect(Collectors.toList());
         System.err.println(intersection);
        }
}