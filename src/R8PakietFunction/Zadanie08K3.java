package R8PakietFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Zadanie08K3 {
    public static void main(String[] args) {
        /*Lista zawiera następujace liczby całkowite: 10,20,30,40,50.
        Napisz program tworzący nową listę, w której każdy element powstał poprzez
        pomnożenie starego elementu przez 20. Wydrukuj element przy pomocy funkcji
        accept().
         */
        List<Integer> numbers= Arrays.asList(10,20,30,40,50);
        System.out.print("Stara lista: ");
        Consumer<Integer> wyswietliste=s-> System.out.print(s+",");
        numbers.forEach(wyswietliste);

        Consumer<List<Integer>> modifiedList=lista->{
            for (int i = 0; i < lista.size(); i++)
                lista.set(i,20*lista.get(i));

        };
        modifiedList.accept(numbers);
        System.out.print("\nZmodyfikowana lista: ");
        numbers.forEach(wyswietliste);
    }
}
