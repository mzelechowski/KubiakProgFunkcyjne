import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zadanie03K3 {
    public static void main(String[] args) {
        /*Dana jest lista składająca się z siedmiu różnych imion.
        Napisz program, który sortuje te imiona w kierunku rosnącym.
         */
        List<String> names = Arrays.asList("Adam", "Maciek", "Wojtek",
                "Grazyna", "Beata", "Katarzyna", "Slawomir");
        Collections.sort(names);
        System.out.println(names);
    }
}
