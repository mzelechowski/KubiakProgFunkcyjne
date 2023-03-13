package R3Funkcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zadanie03K2 {
    public static void main(String[] args) {
    /*Napisz program który listę z zadania 03K2 sortuje w kolejnosci
    odwrotnej
     */
        List<String> lista = new ArrayList<>();
        lista.add("Maciek");
        lista.add("Lolek");
        lista.add("Anna");
        lista.add("Genowefa");
        lista.add("Waclaw");
        System.out.println("Lista w wersji oryginalnej");
        lista.forEach(l -> System.out.print(l + ", "));
        Collections.sort(lista, (String a, String b) -> {
            return b.compareTo(a);
        });
        System.out.println();
        lista.forEach(l-> System.out.print(l+", "));
    }
}
