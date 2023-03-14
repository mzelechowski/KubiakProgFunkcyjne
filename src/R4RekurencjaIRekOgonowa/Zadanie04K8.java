package R4RekurencjaIRekOgonowa;

import java.math.BigInteger;

public class Zadanie04K8 {
    public static void main(String[] args) {
        /*Napisz program, który oblicza największy wpsólny dzielnik NWD(a, b)
        dla dwóch liczb a i b typu BigInteger, korzystają z fabrycznej metody gcd().
         */
        String a1="24";
        String b1="96";
         BigInteger a=new BigInteger(a1);
         BigInteger b=new BigInteger(b1);
        System.out.println("NWD("+a1+","+b1+")="+a.gcd(b));
    }
}
