package R4RekurencjaIRekOgonowa;

class leonardo {
    public static int leo(int n) {
        if (n == 0 || n == 1)
            return 1;
        return (leo(n - 1) + leo(n - 2) + 1);

    }
}

public class Zadanie04K6 {
    public static void main(String[] args) {
        /*Napisz program, który rekurencyjnie gneruje kolejne liczby leonardo
         */
        for (int i = 0; i < 26; i++) {
            System.out.println("L(" + i + ")=" + leonardo.leo(i));
        }
    }
}
