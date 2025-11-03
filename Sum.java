import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;
public class Sum
{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,5,4,32);
       int sum= list.stream()
        .reduce(0,(a,b) -> a+b) ;
         //.reduce(0, Integer::sum);
        System.out.println(sum);
    }

}