package R6Strumienie;

import java.util.Arrays;
import java.util.List;

public class Zadanie06K1a {
    public static void main(String[] args) {
        /*rowiąż zadanie6.1 sposobem strumieni */
        List<String> names = Arrays.asList("Jakub", "Bartosz", "Magdalena", "Sławomira",
                "Marysia", "Dorota", "Maciej");
        System.out.println("Ilosc imion które mają 6 liter wynosi: "+(int) names.stream().filter(n->n.length()==6).count());

    }
}
