package R6Strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie06K8 {
    public static void main(String[] args) {
        /*Napisz program, który ze stałej liczby liczb od 1 do 10 znajduej tylko liczby parzyste*/
        List<String> liczby = Arrays.asList("1","2","3","4","5","6","7","8","9","10");
        List<Integer> parzyte = liczby.stream().map(l->Integer.valueOf(l)).filter(l->l%2==0).collect(Collectors.toList());
        System.out.println(parzyte);
    }
}
