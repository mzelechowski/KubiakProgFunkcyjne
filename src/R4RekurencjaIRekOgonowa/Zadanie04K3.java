package R4RekurencjaIRekOgonowa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Zadanie04K3 {
    public static int fibonacci(int liczba) {
        if (liczba == 0)
            return 0;
        else if (liczba == 1)
            return 1;
        else
            return fibonacci(liczba-1)+fibonacci(liczba-2);
    }

    public static void main(String[] args) {
        /*
        napisz program któy znajduje 10 pierszych liczb
        ciagu Fibonacciego i wyświetla je na ekranie
         */
        int ciag = 0;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj ilosc pierwszych liczb ciagu Fibonacciego do znalezienia: ");
        try {
            ciag = Integer.parseInt(buffer.readLine());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci(i));

        }


    }
}
