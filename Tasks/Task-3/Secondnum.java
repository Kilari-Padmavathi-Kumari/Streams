//Given a list of integers, find the second highest number using streams.
import java.util.*;
import java.util.stream.*;
public class Secondnum
{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,3,5,2,5,6,7,8,3,7,32);
        int i=list.stream()
        .distinct()                                                 // remove duplicates
        .sorted(Comparator.reverseOrder())                          //sort reverse order
        .skip(1)                                                    //first ele skip
        .findFirst()
        .get();
        System.err.println("Second highest number : "+i);

    }
}
