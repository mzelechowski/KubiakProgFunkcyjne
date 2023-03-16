package R6Strumienie;

import java.util.Random;
import java.util.stream.Stream;

public class Zadanie06K6 {
    public static void main(String[] args) {
        /*napisz program któy generuje strumień składający się z dziesicu liczb losowych całkowitych*/
        Stream.generate(new Random()::nextInt).limit(10)
                .forEach(System.out::println);
    }
}
