package R4RekurencjaIRekOgonowa;

class LiczbaCatalana {

    public int catalan(int n) {
        int wynik = 0;
        if (n <= 1)
            return 1;
        for (int i = 0; i < n; i++) {
            wynik += catalan(i) * catalan(n - i - 1);
        }
        return wynik;
    }
}

public class Zadanie04K5 {
    public static void main(String[] args) {
        /*Napisz program który rekurencyjnie znajduje 10 pierwszych liczb Catalana
         */
        LiczbaCatalana lc = new LiczbaCatalana();
        System.out.println("10 pierwszych liczb Catalana: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("C(" + i+")=" + lc.catalan(i));
        }
    }
}
