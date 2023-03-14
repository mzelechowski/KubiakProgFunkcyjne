package R4RekurencjaIRekOgonowa;

import java.math.BigInteger;

class SilniaBig {
    public static BigInteger silnia(int num) {
        BigInteger wynik = BigInteger.ONE;
        for (int i = 1; i <= num; i++)
            wynik = wynik.multiply(BigInteger.valueOf(i));
            return wynik;
    }
}

    public class Zadanie04K12 {
        public static void main(String[] args) {
            //Napisz program, który oblicza 100!. Skorzystaj z metody BigInteger.multiply().
            //Służy ona do obliczania dwóch liczb typu BigInteger
            System.out.println("100!=");
            System.out.print(SilniaBig.silnia(100));
            System.out.print(".");
        }
    }
