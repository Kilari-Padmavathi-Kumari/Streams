import java.util.*;
import java.util.logging.Filter;
public class EvenNumber
{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        list.stream()
        .filter(lists->lists%2==0)
        .forEach(System.out::print);
    }
}