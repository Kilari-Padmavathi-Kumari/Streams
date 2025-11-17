import java.util.*;
import java.util.stream.*;

class Freq
{
    public static void main(String[] args)
    {
        List<Integer> list=Arrays.asList(1,2,2,1,2,3,4,3,4,3,4,34,3,4);
        Map<Integer, Long> freq = list.stream()
        .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
         System.out.println(freq);


    }
}
