import java.util.*;
import java.util.stream.*;

public class Counting {
    String name;
    String dept;

    Counting(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public static void main(String[] args) {
        List<Counting> students = Arrays.asList(
                new Counting("padma", "IT"),
                new Counting("joe", "CSE"),
                new Counting("vedha", "IT"),
                new Counting("ram", "ECE"),
                new Counting("raja", "IT")
        );

        Map<String, Long> countByDept = students.stream()
                .collect(Collectors.groupingBy(s -> s.dept, Collectors.counting()));

        System.out.println(countByDept);
    }
}
