/*import java.util.*;
import java.util.stream.*;

public class Subject {
    private String name;
    private List<String> subjects;
    Subject (String name, List<String> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public static void main(String[] args) {
        List<Subject > sub = Arrays.asList(
            new Subject ("Padma", Arrays.asList("math", "english")),
            new Subject ("Joe", Arrays.asList("science", "history"))
        );

        List<List<String>> result = sub.stream()
                .map(s -> s.subjects.stream()
                                    .map(String::toUpperCase)
                                    .collect(Collectors.toList()))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}*/



import java.util.*;
import java.util.stream.*;

class Subject {
    String name;
    String dept;
    Subject(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public static void main(String[] args) {
        List<Subject> list = List.of(
            new Subject("Padma", "IT"),
            new Subject("Joe", "HR"),
            new Subject("Ram", "IT")
        );

        Map<String, List<Subject>> grouped = list.stream()
                .collect(Collectors.groupingBy(e -> e.dept));
                System.err.println(grouped);
                 grouped.forEach((dept, emps) -> 
            System.out.println(dept + " -> " + emps.stream()
                                                   .map(e -> e.name)
                                                   .toList()));

        
    }
}

