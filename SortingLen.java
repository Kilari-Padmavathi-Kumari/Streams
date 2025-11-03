
import java.util.*;
import java.util.stream.*;
public class SortingLen
{
    public static void main(String[] args) {
        List<String> list=Arrays.asList("padma","josh","kavya","jk");
        List<String> name=list.stream()
        //.filter(n->list.size()>1)
        .sorted()
        //.forEach(System.out::println);         //using collect
        .collect(Collectors.toList());
        System.err.println(name);
        
        list.stream()
        .filter(n->list.size()>1)
        .sorted()                              //using forloop
         .forEach(System.out::println);
    }
}