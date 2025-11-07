import java.util.*;
import java.util.stream.*;

public class WordSplit {
    public static void main(String[] args) {
        List<List<String>> sentences = Arrays.asList( 
            Arrays.asList("Hello world"), 
            Arrays.asList("Java stream flatMap example")
        );

        List<String> words = sentences.stream()
            .flatMap(List::stream)                       // flatten [[...], [...]] → ["Hello world", "Java stream flatMap example"]
            .flatMap(sentence -> Arrays.stream(sentence.split(" "))) // split each sentence into words
            .collect(Collectors.toList());

        System.out.println(words);
    }
}
