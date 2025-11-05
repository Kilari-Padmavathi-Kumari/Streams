import java.util.*;
import java.util.stream.Collectors;
public class EachWord
{
    public static void main(String[] args) 
    {
       String input = "hello world hello";
Map<String, Long> wordCounts = Arrays.stream(input.split(" "))
    .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
System.out.println("Word Counts: " + wordCounts);




    }
}