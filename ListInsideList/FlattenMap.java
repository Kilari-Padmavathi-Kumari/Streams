import java.util.*;
import java.util.stream.*;
public class FlattenMap
{
   public static void main(String[] args) {
       List<List<Integer>> list=Arrays.asList(Arrays.asList(1,2,3,4),
       Arrays.asList(9,6,4,3),
       Arrays.asList(11,23,4,5),
       Arrays.asList(4,53,2,6,2,7));

       List<Integer> ls=list.stream()
      
       .flatMap(List::stream)
       .distinct()
       .sorted()
       .collect(Collectors.toList());
       System.err.println(ls);
   }
}