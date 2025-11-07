/*Given a list of lists of integers, flatten the structure into a single list of integers, then produce a list containing only the squares of distinct odd numbers.
Example input: [[1][2][3], [2][3][4], [5]]
Expected output: [1][9]*/


import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;
public class Flatten{
    public static void main(String[] args) {
       List<List<Integer>> list=Arrays.asList(Arrays.asList(1,2,3),
       Arrays.asList(2,3,4),
       Arrays.asList(5));

       List<Integer> fList=list.stream()
    .flatMap(List::stream)       //nested structures into single stream(convert list of iteam into single ele)[1,2,3,4]   1 2 3 4 
       .filter(n->n%2==1)
       .distinct()
       .map(n->n*n)
       .limit(2)
       .collect(Collectors.toList());
       System.err.println(fList);

    }

}