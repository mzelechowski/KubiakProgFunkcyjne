package R8PakietFunction;

import java.util.function.Predicate;

public class Zadanie08K5 {
    public static void main(String[] args) {
        /*Napisz program, który sprawdza czy podana liczba jest wieksza
        od liczby 18, korzystając z interfejsu java.util.function.Preidicate
         */
        int liczba=20;
        Predicate<Integer> number = x->(x >18);
        System.out.println("Czy liczba "+liczba+" jest większa od 18: "+number.test(liczba));
    }
}
