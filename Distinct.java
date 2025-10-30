import java.util.*;
import java.util.stream.*;
public class Distinct
{
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,5,4,4,3,3,2,1,1,8,8);
        list.stream()
        .distinct()
        .forEach(System.out::println);
    }
}