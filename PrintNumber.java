

import java.util.*;
import java.util.stream.*;
public class PrintNumber
{
public static void main(String[] args) {
    int num=10;
    IntStream
    .range(0,num)
    .boxed()
    .sorted(Comparator.reverseOrder())
    .forEach(System.out::println);
}

    }