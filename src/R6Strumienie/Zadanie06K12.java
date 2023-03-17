package R6Strumienie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Zadanie06K12 {
    public static void main(String[] args) {
        /*napisz program który generuej liczby parzyste z przedziału od 1 do 100
        oraz umieszcza je na liscie
         */
        List<Integer> evenNums = IntStream.rangeClosed(1,100).filter(n->n%2==0).boxed().collect(Collectors.toList());
        System.out.println(evenNums);
    }
}
