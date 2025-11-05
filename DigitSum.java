import java.util.*;
import java.util.stream.*;
public class DigitSum
{
    public static void main(String[] args) {
        int num=123421;
       int sum =String.valueOf(num)
        .chars()
        .map(ch->ch-'0')         //.map(Character::getNumericValue )
        .sum();
        System.err.println(sum);

    }
}