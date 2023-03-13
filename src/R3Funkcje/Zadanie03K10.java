package R3Funkcje;

import java.util.Arrays;
import java.util.List;

public class Zadanie03K10 {
    public static void main(String[] args) {
        /*Napisz program który wyswietli tylko te imiona, których długosć jest wieksza od 4*/
        List<String> names = Arrays.asList("Adam", "Maciek", "Wojtek",
                "Grazyna", "Beata", "Katarzyna", "Slawomir","Anna");
        names.stream().filter(n->n.length()>6).forEach(System.out::println);
    }
}
