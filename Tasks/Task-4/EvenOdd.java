import java.util.stream.*;
import java.util.*;

public class EvenOdd
{
    public static void main(String[] args)
    {
       List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       System.err.println("using Partiton");
       Map<Boolean,Long> ml=list.stream()                // partition return Boolean and count
       .sorted()
       .collect(Collectors.partitioningBy( n->n%2==0 , Collectors.counting()));
       System.err.println(ml);
 
     List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
     System.err.println("Using Grouping");
       Map<Boolean,List<Integer>> m=list1.stream()             // Groupby Boolean and list
       .sorted()
       .collect(Collectors.groupingBy(n->n%2==0));
       System.err.println(m);



    }
}