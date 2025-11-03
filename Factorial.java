import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;
public class Factorial
{
    public static void main(String[] args) {
        int num=5;
        int fact=IntStream
        .rangeClosed(1, num)
        .reduce(1,(a,b)->a*b);
        System.err.println("Factorial : "+ fact);
    
           
    }

}