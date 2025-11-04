/*import java.util.*;
import java.util.stream.*;
public class ParallelStream
{
    public static void main(String[] args) {
        List<String> list=Arrays.asList("padma","kavya","josh");
        System.err.println("using parallel stream");
        list.parallelStream()                                        // parallelstream allow multiple thread at a time output not in insertion order
        .map(String::toUpperCase)
        .forEach(System.out::println);
 
       System.err.println("using stream");
        List<String> newlist=Arrays.asList("padma","kavya","josh");
        list.stream()
        .map(String::toUpperCase)                                    //stream output insertion order
        .forEach(System.out::println);
    }
}
*/ 

import java.util.*;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        System.out.println("Sequential Stream:");
        list.stream()
            .map(n -> {
                System.out.println(Thread.currentThread().getName() + " -> " + n);
                return n * n;
            })
            .forEach(System.out::println);

        System.out.println("\nParallel Stream:");
        list.parallelStream()
            .map(n -> {
                System.out.println(Thread.currentThread().getName() + " -> " + n);
                return n * n;
            })
            .forEach(System.out::println);
    }
}
