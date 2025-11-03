import java.util.*;
import java.util.stream.*;
public class LeapYear
{
    public static void main(String[] args) {
        boolean ans=Stream.of(2016,2018,2020)
        .allMatch(n->(n%4==0&&n%100!=0)||(n%400==0));  // or anyMatch
        System.out.println(ans);
    
           
    }

}