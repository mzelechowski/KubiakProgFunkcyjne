package R7StrumRownolegle;

import java.util.stream.IntStream;

public class Zadanie07K4 {
    public static void main(String[] args) {
        /*Napisz program, który sekwencyjnie i równolegle wyświetla
        strumień wszystkich liter alfabetu a do z
         */
        System.out.println("Liczby od 1 do 10 wyświetlane sekwencyjnie");
        IntStream.rangeClosed(97,122).forEach(r-> System.out.println(Character.toString(r)));
        System.out.println("Liczby od 1 do 10 wyświetlane rownolegle");
        IntStream.rangeClosed(97,122).parallel().forEach(r-> System.out.println(Character.toString(r)));
    }
}
