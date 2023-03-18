package R6Strumienie;

import java.util.stream.IntStream;

class silnia1{
    public static long silnia(int liczba){
        return liczba==1 ? 1 : liczba*silnia(liczba-1);
    }
}

public class Zadanie06K25 {
    public static void main(String[] args) {
        /*Napisz program, który za pomocą rekurencji ogonowej i
        z użyciem strumeinia obliczna 20!;
         */
        System.out.println(silnia1.silnia(4));
        System.out.println(IntStream.rangeClosed(1,4).reduce(1, (x,y)->x*y));
    }
}
