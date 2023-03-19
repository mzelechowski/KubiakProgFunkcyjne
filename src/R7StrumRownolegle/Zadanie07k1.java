package R7StrumRownolegle;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

public class Zadanie07k1 {
    public static void main(String[] args) {
        /*napisz program, który drukuje aktulaną nazwę wątku dla sekwencyjnego
        przetwarzania strumienia
         */
        long star=System.currentTimeMillis();
        System.out.println("Przetwarzanie sekwencyjne");
        System.out.println();
        AtomicLong count = new AtomicLong();
        IntStream range = IntStream.rangeClosed(1,10000);
        range.forEach(r-> {
            count.incrementAndGet();
            System.out.println(count.get()+ " " + Thread.currentThread().getName()
                + ", wartosc: "+ r+".");});
        long end=System.currentTimeMillis();
        long timeElapsed=end - star;
        System.out.println("Took time: "+timeElapsed);
    }
}
