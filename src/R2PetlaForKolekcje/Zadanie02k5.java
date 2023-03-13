package R2PetlaForKolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie02k5 {
    public static void main(String[] args) {
        /* KOrzystają z właściwosci ArrayList() napisz program który do kolekcji
        tego typu dodaje sześć różnych imio, anstęnie je sortuje */

        ArrayList<String> names = new ArrayList<>();
        names.add("Julia");
        names.add("Agata");
        names.add("Zenek");
        names.add("Jarek");
        names.add("Kasia");
        names.add("Dominika");
        System.out.println("Elementy nie posortowane: " + names);
        Collections.sort(names);
        System.out.println("Elementy posortowane: " + names);
        names.remove(1);
        names.add("Maciek");
        Collections.sort(names);
        System.out.println("Elementy ponownie posortowane: "+names);

        //// ROZWIAZANIE NA STREAM'ACH
        names.add("Wojtek");
        System.out.println("\nSortowanie listy by STREAM");
        names.stream().sorted().forEach(n -> System.out.print(n+" , "));
        List<String> sortList = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortList);



    }
}
