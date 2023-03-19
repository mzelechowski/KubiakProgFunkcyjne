package R7StrumRownolegle;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Zadanie07k3 {
    public static void main(String[] args) {
        /*napisz program, który sekwencyjnie i równolegle wyświetla strumienie liczb od 1 do 10.
           */
        System.out.println("Liczby od 1 do 10 wyświetlane sekwencyjnie");
        IntStream.rangeClosed(1,10).forEach(System.out::println);
        //lub
        //IntStream.rangeClosed(1,10).forEach(r-> System.out.println(r));
        //IntStream range= IntStream.rangeClosed(1,10);
        //range.forEach(System.out::println);
        System.out.println("Liczby od 1 do 10 wyświetlane rownolegle");
        IntStream.rangeClosed(1,10).parallel().forEach(System.out::println);

    }
}
