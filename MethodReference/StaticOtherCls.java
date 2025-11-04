//Reference to an Instance Method of a Particular Object
//object::instanceMethodName
import java.util.*;
public class StaticOtherCls
{
    public static void main(String[] args) {
        List<String> list=Arrays.asList("padma","kavya","josh");
        System.err.println("convert uppercase");
        list.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);

        List<Integer> number=Arrays.asList(7,3,2,1,3);
        System.err.println("print Square root");
        number.stream()
        .map(Math::sqrt)
        .forEach(System.out::println);


    
    }
}

        
    