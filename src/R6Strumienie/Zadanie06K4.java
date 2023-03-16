package R6Strumienie;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zadanie06K4 {
    public static void main(String[] args) {
        /*Napisz program, który tworzy strumień kolejnych  liczb od 1 do 10
        na podstawie bieżącej wartości i umieszcza go na liście. Przyjmijmy, że
        liczby te należą do klasy BigInteger.
         */
        List<BigInteger> liczby = Stream.iterate(BigInteger.ONE, n->n.add(BigInteger.ONE))
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(liczby);

        List<BigInteger> liczby11 = Stream.iterate(BigInteger.valueOf(11), n->n.add(BigInteger.valueOf(2)))
                .limit(15)
                .collect(Collectors.toList());
        System.out.println(liczby11);
    }
}
