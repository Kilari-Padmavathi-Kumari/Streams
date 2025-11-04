import java.lang.reflect.Array;
import java.util.stream.*;
import java.util.*;
public class AlphaOrder
{
    public static void main(String[] args) {
    
    String[] arr={"padma","pandu","kavya","josh"};
     Arrays.stream(arr)
    .sorted()
    .forEach(System.out::println);
    
    System.err.println("sorting with length");
    String[] ar={"padma","pandu","kavya","josh"};
     Arrays.stream(ar)
    .filter(n->n.length()>1)
    .sorted()
    .forEach(System.out::println);


    }
}