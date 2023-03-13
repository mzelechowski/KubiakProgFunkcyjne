package R4RekurencjaIRekOgonowa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie04K4 {
    public static int suma(int zakres){
        return zakres==1?1:zakres+suma(zakres-1);
    }
    public static void main(String[] args) {
        /*napisz program ktory rekurencyjnie oblicza sume kolejnych liczb od 1 do 100;
         */
        int zakres=0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj zakres liczb do obliczenia: ");
        try {
            zakres=Integer.parseInt(input.readLine());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println("Suma liczba od 1 do "+zakres+" wynosi: "+suma(zakres));
    }
}
