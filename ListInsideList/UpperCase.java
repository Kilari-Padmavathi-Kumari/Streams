import java.util.*;
import java.util.stream.*;
public class UpperCase
{
    public static void main(String[] args) {
        List<List<String>> list=List.of(List.of("padma","josh"),List.of("potti","chitti"));
        List<List<String>> map=list.stream()
        .map(inner->inner.stream()
          .map(String::toUpperCase)
          .collect(Collectors.toList())
          )
        .collect(Collectors.toList());
        System.err.println(map);
     }
}