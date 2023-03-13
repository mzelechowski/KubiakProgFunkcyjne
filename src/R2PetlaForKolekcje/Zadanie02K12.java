package R2PetlaForKolekcje;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Zadanie02K12 {
    public static void main(String[] args) {

    /*Zmien zdanie 11 - zamiast Integerow, Stringi.
 */
        //TreeSet<Integer> zbior1 = new TreeSet<>();
        Set<String> zbior1 = new TreeSet<>();
        zbior1.add("Maciek");
        zbior1.add("Bartek");
        zbior1.add("Dagmara");
        zbior1.add("Beata");
        System.out.println(zbior1);
        for(var z: zbior1){   // var Java 9
            System.out.println(z);
        }
        System.out.println("Liczba elementow w zbiorze wynosi: " + zbior1.size());
        zbior1.remove("Dagmara");
        System.out.println("Liczba elementow w zbiorze wynosi: " + zbior1.size());
        zbior1.clear();
        System.out.println("Liczba elementow w zbiorze wynosi: " + zbior1.size());
    }
}
