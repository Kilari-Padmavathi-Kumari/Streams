//From a list of integers, filter all even numbers, square them, and find their average
/*import java.util.*;
import java.util.stream.*;
public class Avarage
{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,3,5,2,5,6,7,8,3,7,32);
        Double i=list.stream()
        .filter(n->n%2==0)                                   //find even number 
        .collect(Collectors.averagingDouble(n->n*n));        //avarage(square/their size)

        System.err.println(i);


    }
}*/

import java.util.*;
import java.util.stream.*;
public class Avarage
{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,3,5,2,5,6,7,8,3,7,32);
        int i=list.stream()
        .filter(n->n%2==0)                              //finding even numbers
        .map(n->n*n)                                    // square of the even numbers
        .reduce(0,(a,b)-> a+b )/ list.size();           // avarage (square/list size)
        

        System.err.println(i);


    }
}
