import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie01k1 {
    public static void main(String[] args) {
       /* Dana jest lista o nazwiew imioma, składająca się z
       sześciu różnych imiom. Napisz program który sprawdza i imion zawierw 5
       i wiecej znaków. Wynik wypisz w konsoli
        */
        List<String> imiona = Arrays.asList("Przemek", "Marek", "Wojtek", "Dorota", "Anna","Karol");

        //Rozwiązanie imperatywne
        int licznik=0;
        List<String> listLenghtMin5= new ArrayList<>();
        for(String i:imiona){
            if(i.length()>=5){
                licznik++;
                listLenghtMin5.add(i);
            }
        }
        System.out.println("Imperatywne - Ilosc imion które mają 5 i wiecej liter wynosi: "+licznik);
            System.out.println("oraz oto te imona: " +listLenghtMin5);

        //Rozwiązanie funkcyjne
        int count = (int) imiona.stream().filter(i ->i.length()>=5).count();
        List<String> listFunc = imiona.stream().filter(i ->i.length()>=5).collect(Collectors.toList());
        System.out.println("Funkcyjne - Ilosc imion które mają 5 i wiecej liter wynosi: "+count);
        System.out.println("oraz oto te imona: " +listFunc);
    }
}
