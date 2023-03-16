package R5LambdaInterfejsyFunkcyjne;

interface Liczba2 {
    int pobierzWartosc(int a);
}

public class Zadanie05K3 {
    public static void main(String[] args) {
        /*Npiasz program, który interacyjnie obliczna n! dla dowolnego n z wykorzystaniem
        wyrażenai lamba i interfejsu funkcyjnego
         */
        Liczba2 silnia = n -> {
            int wynik = 1;
            for (int i = 1; i <= n; i++) {
                wynik *= i;
            }
            return wynik;
        };
        System.out.println("Silnia liczy 10 wynosi: " + silnia.pobierzWartosc(10) + ".");
    }
}
