package R6Strumienie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Zadanie06K9 {
    public static void main(String[] args) {
        /*Strumienie - napisz progam któy demonstruje działanie metody range*/
        List<Integer>   numbers = IntStream.range(10,15).boxed().collect(Collectors.toList());
        System.out.println(numbers);
    }
}
