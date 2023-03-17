package R6Strumienie;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Zadanie6K20 {
    public static void main(String[] args) {
                 /*Napsz program, który dla zdania
        Gdyby kózka nie skakała, to by nóżki nie złamała
        oblicza średnią liczbę znaków na słowo.
         */
        String sentence = "Gdyby kózka nie skakała, to by nóżki nie złamała";
        String[] setTab = sentence.split(" ");
        OptionalDouble charSum = Arrays.stream(setTab).mapToInt(String::length).average();
        System.out.println("\nSrednia dlugosc wszystkich znakow wynosi: "+charSum);
    }
}
