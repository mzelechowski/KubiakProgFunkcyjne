package R7StrumRownolegle;

import java.util.stream.IntStream;

public class Zadanie07k2 {
    public static void main(String[] args) {
        /*Napisz program, któy drukuje aktualną nazwę wątku dla
        równloegłego przetwarzania strumienia
         */
        System.out.println("Przetwarzanie równoległe: ");
        System.out.println();

        IntStream range=IntStream.rangeClosed(1,20);
        range.parallel().forEach(r->{
            System.out.println("Watek: "+ Thread.currentThread().getState()+", "
            + "wartosc: "+r+".");
        });
        System.out.println("Mamy "+Runtime.getRuntime().availableProcessors()
        + " procesorów/rdzeni logicznych w naszym komputerze");
    }
}
