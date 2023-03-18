package R6Strumienie;

import java.util.stream.IntStream;

public class Zadanie06K24 {
    public static void main(String[] args) {
        /*Napisz program, który oblicza 10! z użyciem strumieni*/
        System.out.println(IntStream.rangeClosed(1, 10).reduce(1, (x, y) -> x * y));
    }
}
