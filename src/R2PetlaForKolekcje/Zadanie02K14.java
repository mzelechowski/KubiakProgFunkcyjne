package R2PetlaForKolekcje;

import java.util.Vector;

public class Zadanie02K14 {
    public static void main(String[] args) {
        /*vektor */
        Vector vector = new Vector();
        for (int i = 1; i <= 50 ; i++) {
            vector.add(i);
            System.out.println("Rozmiar wektora: " +  vector.size()
            + ", jego pojemnosc: "+ vector.capacity()
            + ", jego zawartosc: " + vector.toString());
        }
    }
}
