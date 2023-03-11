import java.util.Arrays;
import java.util.List;

public class Zadanie03K8 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Adam", "Maciek", "Wojtek",
                "Grazyna", "Beata", "Katarzyna", "Slawomir");
        System.out.println("Lista przed sortowanie");
        for(String n : names){
            System.out.println(n);
        }
    }
}
