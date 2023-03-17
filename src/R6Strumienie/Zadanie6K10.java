package R6Strumienie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Zadanie6K10 {
    public static void main(String[] args) {
        /*Strumienie - napisz progam któy demonstruje działanie metody range.closed*/
        List<Long> numbers = LongStream.rangeClosed(10,15).boxed().collect(Collectors.toList());
        System.out.println(numbers);
    }

}
