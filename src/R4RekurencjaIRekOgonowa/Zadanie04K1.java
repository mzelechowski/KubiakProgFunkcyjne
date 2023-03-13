package R4RekurencjaIRekOgonowa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie04K1 {
    public static int silnia(int n)
    {
        int wynik=1;
        if(n>1)
            wynik=n*silnia(n-1);
        return wynik;
    }
    public static void main(String[] args) {
        /*napisz program, który rekurencyjnie obliczka kolejne wartości n! dla n=10
        i wynik  wyswitla na monitorze
         */
        int i, n=0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj liczbe do oblieczenia jej silni: ");
        try {
            n=Integer.parseInt(input.readLine());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        for (int j = 1; j <= n; j++) {
            System.out.println(j+"!="+silnia(j));
        }
    }
}
