import java.util.HashMap;
import java.util.Map;

public class Zadanie02K13 {
    public static void main(String[] args) {
        /*napisz program, który tworzy strukturę HashMap do przechowywania
        liczb całkowitych
         */
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Maciek");
        mapa.put(2, "Kazimierz");
        mapa.put(3, "Lucja");
        mapa.put(4, "Aleksandra");
        mapa.put(5, "Wojtek");
        System.out.println("Wswietlenie zawartosci tablicy: "+mapa);
        System.out.println("Wyswietlenie zawartosci tablicy poprzez for");
        for(Map.Entry m: mapa.entrySet()){
            System.out.println("Klucz: "+ m.getKey()+" wartosc: "+ m.getValue());
        }
    }
}
