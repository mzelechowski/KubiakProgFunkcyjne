package R4RekurencjaIRekOgonowa;

class fibonacci {
    static int fib(int n, int a, int b) {
        if (n == 0)
            return a;
        if (n == 1)
            return b;
        return fib(n - 1, b, a + b);
    }
}

public class Zadanie04K10 {
    public static void main(String[] args) {
        /*Napisz program, który demosnturjąc rekurencję ogonową,
        oblicza kolejne n-te wyrazy ciągu Fibonacciego dla np. i=20.
         */
        for (int i = 0; i <= 30; i++) {
            System.out.println("F(" + i + ")=" + fibonacci.fib(i, 0, 1));
        }
    }
}
