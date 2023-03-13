package R4RekurencjaIRekOgonowa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie04K2 {

    public static int liczbaTrojkatna(int liczba){
        int zwrot=1;
        if(liczba>1)
            zwrot=liczba+liczbaTrojkatna(liczba-1);
        return zwrot;
    }
    public static void main(String[] args) {
    /*
    Napisz program, który znajduje 10 pierwszych liczb trójkątnych
    i wyświetla je na ekarnie.
     */
        int licza=0;
        BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj zakres liczb trójkątnych: ");
        try {
            licza=Integer.parseInt(buffer.readLine());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println("Pierwszych "+licza+ " liczb trójkątnych to:");
        for (int i = 1; i <=licza ; i++) {
            System.out.println("#"+i+"="+liczbaTrojkatna(i));
        }
    }
}
