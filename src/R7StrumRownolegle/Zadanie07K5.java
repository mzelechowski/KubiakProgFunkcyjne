package R7StrumRownolegle;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;


public class Zadanie07K5 {
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
    public static void main(String[] args) {
        /*Pomiesz czas dla programu, który sekwencyjnie generuje strumień
        liczba pierwszych od 2 do 1000 000 i liczby ich liczbę
         */
        AtomicInteger count = new AtomicInteger();
        long start=System.currentTimeMillis();
        Instant start1 = Instant.now();
        IntStream.rangeClosed(2,500000).filter(r->isPrime(r)).forEach(r-> {
            count.getAndIncrement();
            if (count.get() %30!=0)
                    System.out.print(r+",");
            else
                System.out.print(r+",\n");
        });
        Instant end1 = Instant.now();
        long end=System.currentTimeMillis();

        long timeElapsed=end - start;
        System.out.println("\nTook time: "+ timeElapsed/1000.00000);
        System.out.println(Duration.between(start1, end1));
    }
}
