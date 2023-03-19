package R7StrumRownolegle;

import java.util.stream.IntStream;
import static java.lang.Math.*;

public class Zadanie07K7 {
    public static void main(String[] args) {
        /*Napisz program, który korzystając ze strumienia
        SEKWENCYJNEGO, oblicza liczbę PI
         */
        long start = System.currentTimeMillis();
        int n=99999999;
        System.out.println("Rozpoczynam obliczenia (sekwencyjne liczby PI) ....");
        double pi= IntStream.range(0,n)
                .mapToDouble((a)->4.0*1.0/n*(sqrt(pow(random(),2)+pow(random(),2))<=1?1:0)).sum();
        System.out.println("Obliczona liczba Pi= "+pi+".");
        System.out.println("Stała Pi= " + PI+".");
        System.out.println("Różnica= "+abs(PI - pi)+".");
        long end = System.currentTimeMillis();
        long timeElapsed = end - start;
        System.out.println("\nTook time: " + timeElapsed / 1000.00000);
    }
}
