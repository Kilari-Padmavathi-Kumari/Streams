
import java.util.stream.*;

public class Iterator{
    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 2)
      .limit(5)
      .forEach(System.out::println);
    }
}