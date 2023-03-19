package R7StrumRownolegle;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

public class Zadanie07k2 {
    public static void main(String[] args) {
        /*Napisz program, któy drukuje aktualną nazwę wątku dla
        równloegłego przetwarzania strumienia
         */
        long star=System.currentTimeMillis();
        System.out.println("Przetwarzanie równoległe: ");
        System.out.println();

        IntStream range=IntStream.rangeClosed(1,10000);
        AtomicLong count = new AtomicLong();
        range.parallel().forEach(r->{
            // i++  intelij chce aby zamienić do AtomicLong why ????????????????????????????????/
            count.incrementAndGet();
            System.out.println(count.get() +" Watek: "+ Thread.currentThread().getState()+", "
            + "wartosc: "+r+".");
        });


        long end=System.currentTimeMillis();
        long timeElapsed=end - star;
        System.out.println("Took time: "+timeElapsed);

        System.out.println("Mamy "+Runtime.getRuntime().availableProcessors()
        + " procesorów/rdzeni logicznych w naszym komputerze");

    }
}
