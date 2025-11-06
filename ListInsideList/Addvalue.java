
import java.util.*;
import java.util.stream.*;
public class Addvalue
{
    public static void main(String[] args) {
        List<List<Integer>> list=Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4));
        List<List<Integer>> data=list.stream()
        .map(inner->inner.stream()
        .map(n->n+1)
        .collect(Collectors.toList()))
        .collect(Collectors.toList());
        System.err.println(data);
           }
}