import java.util.HashSet;
import java.util.Set;

public class Zadanie02K10 {
    public static void main(String[] args) {
        /*Napisz program, który tworzy dwa zbiory haszowan: zbior1 i zbior2 do przechowywania łańcuchów znaków.
        W naszym pryzpadku przechowywane będą imiona. Do zbioru 1 dodaje cztery różne imiona i następnie wydrukuj
        zawartość tego zbioru. Następnie ze zbioru1 usuń jedno imię i ponownie wydrukuj zawartość tego zbioru.
        Utwóz zbiór2 składający się z trzech imion i sprawdź, czy zwiera on określone imię. Następnie dodaj zbiór2 do
        zbioru1. W dalszej kolejności odejmiej zbiór2 od zbioru1. Na koniec znajdź część wspólną obu zbiorów. Ostatnie
        czynności udokumentuj wydrukowaniem zawartości zbiorów zbior1 i zbior2.
         */
        Set<String> zbior1 = new HashSet<>();
        zbior1.add("Zofia");
        zbior1.add("Katarzyna");
        zbior1.add("Grzegorz");
        zbior1.add("Tomasz");
        System.out.println("Zbior1 wyglada tak: " +zbior1+".");
        System.out.println("Liczba elementow w zbiorze1 wynosi: "+zbior1.size());

        // usuniecie jednego elementu ze zbioru
        zbior1.remove("Grzegorz");
        System.out.println("\nZe zbioru1 usunieto 1 element");
        System.out.println("Zbior1 wyglada tak: " +zbior1+".");
        System.out.println("Liczba elementow w zbiorze1 wynosi: "+zbior1.size());

        //Utworzenie zbioru2
        Set<String> zbior2 = new HashSet<>();
        zbior2.add("Jacek");
        zbior2.add("Aleksander");
        zbior2.add("Jan");
        System.out.println("\nZbior1 wyglada tak: " +zbior2+".");
        System.out.println("Liczba elementow w zbiorze1 wynosi: "+zbior2.size());

        System.out.println("\nCzy w zbiorze2 znajduje się Dorota: "+zbior2.contains("Dorota"));

        zbior1.addAll(zbior2);
        System.out.println("\nZbior1 pod dodatniu zbioru 2 wyglada tak: " +zbior1+".");
        System.out.println("Liczba elementow w zbiorze1 wynosi: "+zbior1.size());

        zbior1.removeAll(zbior2);
        System.out.println("\nZbior1 po odjęciu zbioru 2 wyglada tak: " +zbior1+".");
        System.out.println("Liczba elementow w zbiorze1 wynosi: "+zbior1.size());

        zbior1.retainAll(zbior2);
        System.out.println("\nRetainAll - po zachowaniu wspolnych elementow zbiorów, zbior1 wyglada: " +zbior1+".");
        System.out.println("Liczba elementow w zbiorze1 wynosi: "+zbior1.size());




    }
}
