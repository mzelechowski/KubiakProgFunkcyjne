package R6Strumienie;

import java.util.Arrays;

public class Zadanie6K19 {
    public static void main(String[] args) {
         /*Napsz program, który dla zdania
        Gdyby kózka nie skakała, to by nóżki nie złamała
        oblicza liczbę wszystkich znaków.
         */
        String sentence="Gdyby kózka nie skakała, to by nóżki nie złamała";
        String[] setTab=sentence.split(" ");
        int charSum= Arrays.stream(setTab).mapToInt(String::length).sum();
        System.out.println(charSum);
    }
}
