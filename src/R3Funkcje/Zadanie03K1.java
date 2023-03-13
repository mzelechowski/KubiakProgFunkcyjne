package R3Funkcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zadanie03K1 {
    public static void main(String[] args) {
        /*Npisz program który sortuje listę Stringów przy pomocy
        metody compareTo
         */
        List<String> lista = new ArrayList<>();
        lista.add("Ewelina");
        lista.add("Maciek");
        lista.add("Ania");
        lista.add("Piotrek");
        lista.add("Barbara");
        System.out.println("Lista przed sortowaniem");
        lista.stream().forEach(l -> System.out.print(l + ", "));
        Collections.sort(lista, (String a, String b) ->
        {
            return a.compareTo(b);
        });
        System.out.println("Lista po sotowaniu.");
        System.out.println(lista);
    }
}
