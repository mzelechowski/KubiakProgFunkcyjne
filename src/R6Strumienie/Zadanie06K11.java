package R6Strumienie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Zadanie06K11 {
    public static void main(String[] args) {
        /*Strumienie - napisz progam któy generuje liczby od 1 do 100 */
        List<Integer> numbers = IntStream.rangeClosed(1,100).boxed().collect(Collectors.toList());
        System.out.println(numbers);
    }
}
