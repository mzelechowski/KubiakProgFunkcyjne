package R6Strumienie;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Zadanie06K3 {
    public static void main(String[] args) {
        /* Napisz program, który korzystając z metody Arrays.stream, tworzy strumień
        z czterech dowolnych imion
         */
        String[] osoby={"Jakub", "Bartosz", "Magdalena", "Sławomira"};
        String imiona= Arrays.stream(osoby).collect(Collectors.joining(", "));
        System.out.println(imiona);
    }
}
