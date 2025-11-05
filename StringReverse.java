import java.util.*;
import java.util.stream.Collectors;
public class StringReverse
{
    public static void main(String[] args) {
       String str="hello";
       String reversed =str.chars()
    .mapToObj(c -> String.valueOf((char) c))
    .reduce("", (a, b) -> b + a);
System.out.println("Reversed String: " + reversed);
    




    }
}