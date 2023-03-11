import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Zadanie03K5 {
    public static void main(String[] args) {
        /*Napisz zadanie03K04 używając klasy anonimowej*/
        /*klasa anonimowa to klasa która nie posiada nazwy */
        List<String> names = Arrays.asList("Adam", "Maciek", "Wojtek",
                "Grazyna", "Beata", "Katarzyna", "Slawomir");
        System.out.println("Lista przed sortowanie");
        System.out.println(names);

        System.out.println("Lista po sortowaniu");
        /* skad mam wiedziec ze tu mogą sobie podstawić taki Comparator,
        skad mam wiedziec że taka skladnia jest dopuszzona*/
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(names);
    }
}
