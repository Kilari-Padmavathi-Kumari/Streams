import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;
public class SecondSmall
{
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,2,1,3};         //primitive int values
       int number= Arrays.stream(num)      //create IntStream not stream(that means primitivr ints)
        .distinct()
        .boxed()           // converts IntStream → Stream<Integer>
        .sorted()
        .skip(1)
        .findFirst()
        .get();
        System.out.println("Second small : "+number);

    
           
    }

}