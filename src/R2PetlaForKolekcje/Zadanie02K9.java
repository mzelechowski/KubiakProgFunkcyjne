package R2PetlaForKolekcje;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Zadanie02K9 {
    public static void main(String[] args) {
        /*napisz program, który tworzy zbiór haszowany do przechowywania łańcuchów
        znaków (w naszym przypadku imion) i używa petli foreach oraz metody foreach
        do przetwarzania elementó tego zbioru.Imona należy wyświetlić.
         */
        Set<String> names = new HashSet<>();
                names.add("Piotrek");
                names.add("Katarzyna");
                names.add("Anna");
                names.add("Maciek");
                names.add("Wojtek");
                names.add("Bronislaw");
                names.add("maciek");
                names.add("Piotrek");
        System.out.println(names);
        for (String n:names) {
            System.out.print(n.toUpperCase()+", ");
        }
        System.out.println();
        for (String n:names) {
            System.out.print(n.toLowerCase()+", ");
        }
        Set<String> names1 = new HashSet<>();
        for (String n:names) {
            names1.add(n.toLowerCase());
        }
        System.out.println("Kopia listy imoin");
        for (String n:names1) {
            System.out.print(n+", ");
        }


    }
}
