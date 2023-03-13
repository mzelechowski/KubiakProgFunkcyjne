package R3Funkcje;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie03K12 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adam", "Maciek", "Wojtek",
                "Grazyna", "Beata", "Katarzyna", "Slawomir","Anna");
        List<String> names4=names.stream().filter(n->n.length()>4).map(n->n.toUpperCase()).collect(Collectors.toList());
        System.out.println(names4);

        System.out.println("\nWypisanie przy pomocy foreach");
        names4.stream().forEach(n-> System.out.print(n+", "));

        ///////////////////////////// co robi funkcja .peek z zadania 3k11
        System.out.println("\nWypisanie przy pomocy PEEK");
        names4.stream().peek(n-> System.out.print(n+", "));
        names4.stream().peek(System.out::println);
    }
}
