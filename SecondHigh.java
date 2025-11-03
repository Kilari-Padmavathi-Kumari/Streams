import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;
public class SecondHigh
{
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,2,1,3};
       int number= Arrays.stream(num)
        .distinct()
        .boxed()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .get();
        System.out.println("Second High : "+number);

    
           
    }

}