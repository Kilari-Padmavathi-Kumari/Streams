//Reference to an Instance Method of a Particular Object
//ClassName::instanceMethodName

import java.util.*;

public class Object {
    void printMsg(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
      Object object= new Object();  // a particular object
        List<String> names = List.of("Padma", "Kavya", "Niharika");

        // Lambda: names.forEach(name -> printer.printMsg(name));
        names.forEach(object::printMsg); //  Method reference
    }
}
