import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Zasanie03K7 {

    public static void main(String[] args) {
        /*napisz sortowanie listy imion w postaci referncji do metody*/

        List<String> names = Arrays.asList("Adam", "Maciek", "Wojtek",
                "Grazyna", "Beata", "Katarzyna", "Slawomir");
        System.out.println("Lista przed sortowanie");
        System.out.println(names);

        /*jak stosując referencje do metody zrobic sortowanei odwrtone!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! */
        System.out.println("Lista po sortowaniu");
        Collections.sort(names, String::compareTo);
        System.out.println(names);

        ///////////////////////////
        Collections.sort(names, (s, anotherString) -> anotherString.compareTo(s));
        System.out.println(names);
    }
}
