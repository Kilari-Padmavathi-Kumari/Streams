//Grouping and Counting
//From a list of transactions, group them by category and count how many transactions are in each category   

import java.util.*;
import java.util.stream.*;

public class CountingFilter
{
     private String id;
        private String category;
        private double amount;
       

    public CountingFilter(double amount, String category, String id) {
        this.amount = amount;
        this.category = category;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }
    
       public static void main(String[] args) {
           List<CountingFilter> list=List.of(new CountingFilter(50000,"food","3"),
           new CountingFilter(48000,"games","3"),
           new CountingFilter(53000,"food","3"),
           new CountingFilter(54500,"games","3"),
           new CountingFilter(23610,"activity","3"),
           new CountingFilter(21330,"activity","3"));

          Map<String,Long>slist= list.stream()
          .collect(Collectors.groupingBy(CountingFilter::getCategory,Collectors.counting()));
          // .collect(Collectors.groupingBy(c->c.getCategory(), Collectors.counting()));
           System.err.println(slist);
       } 
}