import java.util.*;
import java.util.stream.*;
public class Product
{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(5,10);
        int product=list.stream()
        .reduce(1,(a,b)-> a*b);
        System.err.println(product);

    }
}