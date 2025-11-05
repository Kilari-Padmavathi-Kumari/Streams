import java.util.*;
import java.util.stream.Collectors;
public class CountOccurrences
{
    public static void main(String[] args) 
    {
       List<String> words=List.of("apple","banana","apple");
       Map<String,Long> wordCount=words.stream()
       .collect(Collectors.groupingBy(s->s ,Collectors.counting()));
       System.err.println(wordCount);




    }
}