import java.util.*;
import java.util.stream.*;
public class Average
{
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,42,3,4);
        int avg=list.stream()
        .reduce(0,(a,b)-> a+b )/ list.size();
        System.err.println(avg);
    }
}