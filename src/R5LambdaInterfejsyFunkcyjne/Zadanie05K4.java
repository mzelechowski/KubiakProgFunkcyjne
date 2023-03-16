package R5LambdaInterfejsyFunkcyjne;

import javax.script.ScriptContext;
import java.util.Scanner;
import java.util.function.Function;

public class Zadanie05K4 {
    public static void main(String[] args) {
        /*Napisz program, który iteracyjnie obliczna n! dla dowolnego n z wykorzystaniem
        genertycznego wyrażenia lambda i fabrycznego interfejsu funkcyjnego
        znajdującego się pakiecie java.util.function.Function.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą dla której obliczyć silnie: ");
        int liczba = scanner.nextInt();

        Function<Integer, Integer> fun = (n) -> {
            int wynik = 1;
            for (int i = 1; i <= n; i++) {
                wynik *= i;
            }
            return wynik;
        };
        System.out.println("Silnicza liczby " + liczba + " wynosi: " + fun.apply(liczba) + ".");
    }
}
