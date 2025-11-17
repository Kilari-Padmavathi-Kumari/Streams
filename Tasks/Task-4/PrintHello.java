import java.util.stream.*;

class PrintHello
{
    public static void main(String[] args)
    {
        Stream.of("hello world")
        .forEach(System.out::println);
  
        Stream.of(1,2,3,4,5,6,7,8,4)
        .sorted()
        .forEach(System.out::print);


    }
}
