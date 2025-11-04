import java.util.*;
import java.util.stream.*;
public class GroupLength
{
    public static void main(String[] args) {
        List<String> list=List.of("padma","kavya","josh","vedha");
        list.stream()
        .collect(Collectors.groupingBy(String::length));
        
         
        

    }
}