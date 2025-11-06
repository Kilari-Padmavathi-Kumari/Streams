import java.util.stream.*;
import java.util.*;
public class GroupAge
{
    private String name;
    private int age;

    public GroupAge(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString()
    {
        return name+" "+age;
    } 
    public static void main(String[] args) {
        List<GroupAge> list=Arrays.asList(new GroupAge(23,"padma"),
        new GroupAge(24,"josh"),
        new GroupAge(22,"padma"),
        new GroupAge(28,"jk"));

        Map<String,List<GroupAge>> map=list.stream()
        .collect(Collectors.groupingBy(s->s.name));
        System.err.println(map);
    }
    
}