package R2PetlaForKolekcje;

import java.util.Arrays;

public class Zadanie02k1 {
    public static void main(String[] args) {
        /*Napisz program który jednowymiarowej wpisuje liczby od 1 do 100
        i następnie je sumuje
         */
        int n=100, suma=0;
        int [] tab=new int[n];
        for (int i = 1; i <=n ; i++) {
            tab[i-1]=i;
        }
        for (int t:tab) {
            suma+=t;
        }
        System.out.println("Suma elemntow z tablicy 1-100 wynosi: "+suma);

        //funkcynie
        int sumAll = Arrays.stream(tab).sum();
        System.out.println("Suma elemntow z tablicy 1-100 wynosi: "+sumAll);
    }
}
