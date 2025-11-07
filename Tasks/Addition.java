/*Create a list of integers and:

Print only even numbers using streams.

Find the sum of all numbers.

Find the maximum and minimum values using reduce().*/

import java.util.*;
import java.util.stream.*;
public class Addition
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,1,23,6,86,4,32,2,3,5,52);
       int ls= list.stream()
        .filter(n->n%2==0)
        .sorted()
        .reduce(0,(a,b)->a+b);
        System.err.println(ls);
        
        
       


    }
}
