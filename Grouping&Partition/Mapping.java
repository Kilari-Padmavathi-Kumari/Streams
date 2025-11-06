import java.util.*;
import java.util.stream.*;
public class Mapping
{
    public static void main(String[] args) {
        
    List<String> names = List.of("padma", "joe", "ram", "vedha");

Map<Integer, List<String>> grouped = names.stream()
    .collect(Collectors.groupingBy(
        String::length,
        Collectors.mapping(String::toUpperCase, Collectors.toList())
    ));

System.out.println(grouped);
}
}
