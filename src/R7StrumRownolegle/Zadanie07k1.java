package R7StrumRownolegle;

import java.util.stream.IntStream;

public class Zadanie07k1 {
    public static void main(String[] args) {
        /*napisz program, który drukuje aktulaną nazwę wątku dla sekwencyjnego
        przetwarzania strumienia
         */
        System.out.println("Przetwarzanie sekwencyjne");
        System.out.println();
        IntStream range = IntStream.rangeClosed(1,10);
        range.forEach(r-> System.out.println("Watek: " + Thread.currentThread().getName()
                + ", wartosc: "+ r+"."));
    }
}
