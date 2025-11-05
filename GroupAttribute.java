import java.util.*;
import java.util.stream.*;
public class GroupAttribute
{
    public static void main(String[] args) {
        List<String> list=List.of("padma","kavya","joe");
        Map<Character,List<String>> map=list.stream()
        .collect(Collectors.groupingBy(s->s.charAt(0)));
        System.err.println(map);
    }
}