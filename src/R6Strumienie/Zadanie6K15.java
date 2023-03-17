package R6Strumienie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Zadanie6K15 {
    public static void main(String[] args) {
        /*Napisz program który generuje wszystkie liczby parzyste od 1 do 100.
        Dodatkowo program oblicza sumę wszystkich liczb parzystych znajdujacych się na liscie
                 */
        List<Integer> evenNumbers= IntStream.rangeClosed(1,100).filter(n->n%2==0).boxed().collect(Collectors.toList());
        int sumNumbers= IntStream.rangeClosed(1,100).filter(n->n%2==0).sum();
        System.out.println(sumNumbers);

        int sumNums=evenNumbers.stream().collect(Collectors.summingInt(s->s));
        System.out.println(sumNums);

        sumNums=evenNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumNums);
    }
}
