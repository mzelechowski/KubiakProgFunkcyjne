package R6Strumienie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zadanie06K2 {
    public static void main(String[] args) {
        /*Napisz program, który za pomocą metody Stream.of tworzy strumień
        składający się z czterech dowolnych imon
         */
        String names= Stream.of("Marek", "Bartek", "Wojtek", "Tomek", "Marysia").collect(Collectors.joining(", "));
        System.out.println(names);
    }
}
