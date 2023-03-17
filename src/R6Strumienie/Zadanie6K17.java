package R6Strumienie;

import java.util.stream.IntStream;

public class Zadanie6K17 {
    public static void main(String[] args) {
        /*Napisz program który sumuje liczby od 1 do 100 przy użyciu metody reduce*/
        int sum= IntStream.rangeClosed(1,100).sum();
        System.out.println(sum);

        sum=IntStream.rangeClosed(1,100).reduce(0,Integer::sum);
        System.out.println(sum);

        sum=IntStream.rangeClosed(1,100).reduce((x,y)->x+y).orElse(0);
        System.out.println(sum);

    }
}
