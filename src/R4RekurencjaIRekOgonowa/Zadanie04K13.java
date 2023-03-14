package R4RekurencjaIRekOgonowa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie04K13 {
    public static int silnia(int n) {
        return n == 0 ? 1 : n * silnia(n - 1);
    }

    public static void main(String[] args) {
        /*Napisz program, który rekurencyjnie oblicza kolejne wartości n! dla n=10
        z wykorzystaniem operatora warunkowego trójskładnikowego i wyświetla wyniki na ekranie
         */
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj liczbę do której obliczyć silnię: ");
        try {
            int liczba = Integer.parseInt(bufer.readLine());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println("silnnia liczby " + i + "!=" + silnia(i));
        }
    }
}
