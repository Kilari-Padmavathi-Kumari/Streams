
import java.util.*;
import java.util.stream.*;
public class Multiplication
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    IntStream                   //range(1,10) 1->9
    .rangeClosed(1,10)                         //  rangeClosed(1,10) 1->10
    .map(n->n*a)
    .forEach(e->System.out.println(a+"x"+e/a+"="+e));
    }
}