package R3Funkcje;

import java.util.Arrays;
import java.util.List;

public class Zadanie03K11 {
    public static void main(String[] args) {
        /*napisz program liczący z ilu imion, który długość jest większa od 4
        składa się lista imoina */
        List<String> names = Arrays.asList("Adam", "Maciek", "Wojtek",
                "Grazyna", "Beata", "Katarzyna", "Slawomir","Anna");
        int count = (int) names.stream().filter(n->n.length()>4).count();
        System.out.println("Liczba imion dłuższych od 4 wynosi: "+count);
        ////////////////////////////// inny sposob  wypisanie + od razu zliczenie
        count = (int) names.stream().filter(n->n.length()>6).peek(System.out::println).count();
    }
}
