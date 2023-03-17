package R6Strumienie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Zadanie6K16 {
    public static void main(String[] args) {
                    /*Napisz program który generuje wszystkie liczby  nieparzyste od 1 do 100.
        Dodatkowo program oblicza sumę wszystkich liczb parzystych znajdujacych się na liscie
                 */
        List<Integer>  oddNumbers= IntStream.rangeClosed(1,100).filter(n->n%2==1).boxed().collect(Collectors.toList());

        int sumNums= IntStream.rangeClosed(1,100).filter(n->n%2==1).sum();
        System.out.println(sumNums);

        sumNums= oddNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumNums);

        sumNums=oddNumbers.stream().collect(Collectors.summingInt(o->o));
        System.out.println(sumNums);
    }
}
