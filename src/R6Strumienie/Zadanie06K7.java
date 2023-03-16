package R6Strumienie;

import java.util.Random;
import java.util.stream.Stream;

public class Zadanie06K7 {
    public static void main(String[] args) {
        /*Napisz program, który generuje strumień składaący się z 10 liczb lsowych typu Double
         */
        Stream.generate(new Random()::nextDouble).limit(10).forEach(System.out::println);
    }
}
