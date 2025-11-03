import java.util.*;
import java.util.stream.*;
public class Contains
{
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,45,3);
       boolean num= list.stream()
        .anyMatch(n->n==3);
        System.out.print(num);
    }
}