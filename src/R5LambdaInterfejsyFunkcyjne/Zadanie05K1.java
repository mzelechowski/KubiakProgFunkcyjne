package R5LambdaInterfejsyFunkcyjne;

interface Liczba {
    double pobierzWartosc();
}

public class Zadanie05K1 {
    public static void main(String[] args) {
        /* Napisz program w któym wykorzystano wyrazenie lambda i interfejs funkcyjny
        do pobrania i wyświetlenia stałem matematycznej PI.
         */
        Liczba zmienna;
        zmienna=()->Math.PI;
        System.out.println("Liczba PI="+ zmienna.pobierzWartosc()+".");
    }
}
