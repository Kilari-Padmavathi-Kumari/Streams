import java.sql.Array;
import java.util.*;
import java.util.logging.Filter;
import java.util.stream.*;
public class AllAnyMatch
{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,3,4,65,8,9);
        boolean allOdd=list.stream()
        .allMatch(n->n%2==1);
        System.err.println("all odd : "+allOdd);

        boolean anyOdd=list.stream()
        .anyMatch(n->n%2==1);
        System.err.println("any odd : "+anyOdd);

     
    }
}