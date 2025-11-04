//Reference to a Static Method
//ClassName::staticMethodName
import java.util.*;
public class SameClsStatic
{
    static void method(int a)
    {
        System.err.println("hello method");
        System.err.println(a);
    }
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,21,2,4);
        list.forEach(SameClsStatic::method);  //.map(SameClsStatic::mathod)
    }
}