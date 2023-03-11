import java.util.Arrays;
import java.util.List;

public class Zadanie03K9 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adam", "Maciek", "Wojtek",
                "Grazyna", "Beata", "Katarzyna", "Slawomir");
        System.out.println("Wyswietlenie przy pomocy lambdy");
        names.stream().forEach(n-> System.out.println(n));
        System.out.println("Wyswietlenie przy pomocy referencji do metody");
        names.stream().forEach(System.out::println);
    }
}
