import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;
public class Partitioneven
{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(3,4,22,4,5,21,1);
       Map<Boolean,List<Integer>> map=list.stream()
       .collect(Collectors.partitioningBy(n->n%2==0));
       System.err.println(map);

       
}
    }