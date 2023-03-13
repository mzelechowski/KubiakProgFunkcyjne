package R3Funkcje;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Zadanie03K6 {
    public static void main(String[] args) {
        /*Napisz zadanie03K0 używając wyrazenia lambda*/
        /*klasa anonimowa to klasa która nie posiada nazwy */
        List<String> names = Arrays.asList("Adam", "Maciek", "Wojtek",
                "Grazyna", "Beata", "Katarzyna", "Slawomir");
        System.out.println("Lista przed sortowanie");
        System.out.println(names);

        System.out.println("Lista po sortowaniu");

        /* skad mam wiedziec ze tu mogą sobie podstawić taką lambde*/

        Collections.sort(names, (String a, String b) -> b.compareTo(a));
        System.out.println(names);
    }
}
