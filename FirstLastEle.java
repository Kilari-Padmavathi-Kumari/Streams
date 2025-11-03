
/*import java.util.*;
import java.util.stream.*;
public class FirstLastEle
{
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,5};
        System.out.println("first ele is");
        int first=Arrays.stream(numbers)
        .findFirst()
        .getAsInt();
        System.out.println(first);

        System.out.println("Last ele is");
        int last=Arrays.stream(numbers)
        .reduce((a,b)->b)
        .getAsInt();
        System.out.println(last);

    }
}*/


import java.util.*;
import java.util.stream.*;
public class FirstLastEle
{
    public static void main(String[] args) {
       List<Integer> list=List.of(1,2,3,4,5,6,7,89);
      int ele= list.stream()
       .findFirst()
       .get();
        System.err.println("First ele is : "+ele);
 
        int num= list.stream()
        .limit(7)
        .skip(1)
       .findAny()
       .get();
        System.err.println("any ele is : "+num);

         int last= list.stream()
        .skip(list.size()-1)
        .findFirst()
        .get();
        System.err.println("last ele is : "+last);


    }
}
