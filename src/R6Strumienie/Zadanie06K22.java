package R6Strumienie;

import java.util.stream.IntStream;
import java.util.stream.Stream;

class TrojkiPitagoreskie {
    Stream<double[]> trojki1 = IntStream.rangeClosed(1, 100).boxed()
            .flatMap(a -> IntStream.rangeClosed(a, 100)
                    .mapToObj(b -> new double[]{a, b, Math.sqrt(a * a + b * b)}).filter(t -> t[2] % 1 == 0));
}
public class Zadanie06K22 {
    public static void main(String[] args) {
        /*Napisz program, który generuje 10 trójek pitagorejskich*/
        TrojkiPitagoreskie tp= new TrojkiPitagoreskie();
        tp.trojki1.limit(10).forEach(t-> System.out.println("("+t[0]+", "+t[1]+", "+t[2]+")"));
    }
}
