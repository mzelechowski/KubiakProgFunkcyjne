import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Zadanie02K11 {
    public static void main(String[] args) {
        /*Napisz program, ktróry tworzy zbiór z uzyciem klasy TreeSet.
        Nastepnie korzystajac z metody add(), dodaj do tego zbioru liczby w kolejnosci
        10,2,35,3 i wydrukuj je. Dodatkowo, za pomocą metody size(), oblicz rozmiar tego zbioru.
        Korzystajac z metody remove(2), usun liczbe 2 z tego zbioru. Ponownie oblicz jego rozmiar.
        Na koniec polecenime clear, usunze zbioru pozostale jego wartosci i ponownie oblicz jego rozmiar.
         */
        //TreeSet<Integer> zbior1 = new TreeSet<>();
        Set<Integer> zbior1 = new TreeSet<>();
        zbior1.add(10);
        zbior1.add(2);
        zbior1.add(35);
        zbior1.add(3);
        System.out.println(zbior1);
        System.out.println("Liczba elementow w zbiorze wynosi: "+zbior1.size());
        zbior1.remove(2);
        System.out.println("Liczba elementow w zbiorze wynosi: "+zbior1.size());
        zbior1.clear();
        System.out.println("Liczba elementow w zbiorze wynosi: "+zbior1.size());
        }
    }

