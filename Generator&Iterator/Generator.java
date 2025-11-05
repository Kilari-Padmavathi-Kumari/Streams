import java.util.stream.*;

public class Generator{
    public static void main(String[] args) {
        Stream.generate(() -> "Padma") // create infinite stream of "Padma"
              .limit(5)                // stop after 5 elements
              .forEach(System.out::println);
    }
}
