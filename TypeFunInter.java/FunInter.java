import java.util.*;
import java.util.function.*;

public class FunInter {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

             Predicate<Integer> isEven = n -> n % 2 == 0;                                   // Predicate — test condition (keep even numbers)
       
             Function<Integer, Integer> square = n -> n * n;                               // Function — transform value (square the number)

             Consumer<Integer> printer = System.out::println;                             // Consumer — perform action (print number)

                 BinaryOperator<Integer> sumOperator = Integer::sum;                     //BinaryOperator — combine results (sum)
       
        int sum = numbers.stream()
                         .filter(isEven)       // Predicate — filter even numbers
                         .map(square)          // Function — square each even number
                         .peek(printer)        // Consumer — print each squared number
                         .reduce(0, sumOperator); // BinaryOperator — sum them all

        System.out.println("Sum of squares of even numbers: " + sum);
    }
}
