import java.util.*;
import java.util.stream.*;
public class SpecificAttribute
{
    private String name;
    private int age;

    public SpecificAttribute(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString()
    {
        return name+" "+age;
    }

     public static void main(String[] args) {
        List<SpecificAttribute> list=Arrays.asList(new SpecificAttribute(22,"padma"),
        new SpecificAttribute(24,"kavya"),new SpecificAttribute(22,"joe"));
        Map<Integer,List<SpecificAttribute>> map=list.stream()
        .collect(Collectors.groupingBy(SpecificAttribute::getAge));
        System.err.println(map);
    }

}