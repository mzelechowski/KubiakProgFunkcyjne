package R4RekurencjaIRekOgonowa;

import java.math.BigInteger;

class fib {
    public static BigInteger fibonacci1(int n) {
        if (n == 1 || n == 2) {
            return BigInteger.ONE;
        }
        BigInteger fibo1 = BigInteger.ONE;
        BigInteger fibo2 = BigInteger.ONE;
        BigInteger fibonacci = BigInteger.ZERO;
        for (int i = 3; i <= n; i++) {
            fibonacci=fibo1.add(fibo2);
            fibo1=fibo2;
            fibo2=fibonacci;
        }
        return fibonacci;
    }
}

public class Zadanie04K11 {
    public static void main(String[] args) {
        /*Napisz program, który znajduje tysieczny wyraz ciągu Fbonacciego*/
        System.out.println("F(1000)="+fib.fibonacci1(1000)+".");
    }
}
