import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*oryginalnie w przykladzie byla klasa i w klasie była klasa wewnętrzna - po co i do to daje ?*/
class reversSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}

public class Zadanie03K4 {
    /* napisz zadanie które sortuje listę z zadania 03k3 ale w odwrtonej kolejnosci */


    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adam", "Maciek", "Wojtek",
                "Grazyna", "Beata", "Katarzyna", "Slawomir");
        System.out.println("Lista przed sortowanie");
        System.out.println(names);
        Collections.sort(names, new reversSort());
        System.out.println("Lista po sortowaniu");
        System.out.println(names);
    }
}
