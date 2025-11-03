/*import java.util.*;
import java.util.stream.*;
public class MaxMinVal
{
    public static void main(String[] args) {
        List<Integer> list=List.of(2,3,1,2,3,29); 
        int min=list.stream()                      // smallest Iteger val -2147483648
        .reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b);
        System.err.println("min :"+min);


        int max=list.stream()
        .reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
        System.err.println("max : "+max);

    }
}*/

import java.util.*;
import java.util.stream.*;
public class MaxMinVal
{
    public static void main(String[] args) {
        List<Integer> list=List.of(2,3,1,2,3,29); 
        int min=list.stream()                      // smallest Iteger val -2147483648
        .min(Integer::compare)
        .get();
        System.err.println("min : "+min);


        int max=list.stream()
        .max(Integer::compare)
        .get();
        System.out.print("max : "+max);

    }
}
