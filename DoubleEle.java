import java.util.*;
import java.util.stream.*;
public class DoubleEle
{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,4,2,3,5,6,8,7);
        list.stream()
        .filter(lists ->lists%2==0)
        .sorted()
        .map(lists -> lists*lists)
        .forEach(System.out::println);
    }
}
