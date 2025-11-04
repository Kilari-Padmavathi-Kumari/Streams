//Reference to a Constructor
//x: ClassName::new

import java.util.*;
public class Constructor {
    private String name;

    public Constructor(String name) {
        this.name = name;
    }

    public String toString() {
        return "Student: " + name;
    }

    public static void main(String[] args) {
        List<String> names = List.of("Padma", "Kavya", "Niharika");

        // Lambda version
        // names.stream()
        //.map(name -> new Student(name))
        //.forEach(System.out::println);


        // Method reference
        names.stream()
             .map(Constructor::new)  // Constructor reference
             .map(Constructor::toString)
             .forEach(System.out::println);
    }
}
