package R6Strumienie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Zadanie6K14 {
    public static void main(String[] args) {
        /*napisz program który gnereuje liczby z zakersu o 1 do 100 oraz umieszcza je
        na liście. Dodatkowo program oblicza sumę wszystkich elementów znajdujacych się
        na liście.
         */
        List<Integer> numbers = IntStream.rangeClosed(1,100).boxed().collect(Collectors.toList());
        int sumNumbers= IntStream.rangeClosed(1,100).sum();
        System.out.println(sumNumbers);

        //or
        sumNumbers=numbers.stream().collect(Collectors.summingInt(n->n));
        System.out.println(sumNumbers);

        //or
        sumNumbers=numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumNumbers);
    }
}
