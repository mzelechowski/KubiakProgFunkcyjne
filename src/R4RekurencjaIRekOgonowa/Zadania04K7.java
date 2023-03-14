package R4RekurencjaIRekOgonowa;
class NWD{
    public static long gcd(long a, long b){
        if (a==0) return b;
        if (b==0) return a;
        if(a > b) return gcd(b, a%b);
        return gcd(a, b%a);
    }
}
public class Zadania04K7 {
    public static void main(String[] args) {
        /*napisz program który rekurencyjnie oblicza największy wspólny
        dzielnik NWD(a,b) dla wóch liczb całowitych a i b
         */
        long a=16, b=24;
        System.out.println("NWD("+a+","+b+")="+NWD.gcd(a,b));
    }
}
