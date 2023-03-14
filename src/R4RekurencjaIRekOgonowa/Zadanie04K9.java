package R4RekurencjaIRekOgonowa;
class Rekur_ogon{
    public static long silnia(int n){
        return silnia(n, 1);
    }
    public static long silnia(int n, long akum){
        if(n==0)
            return akum;
        else
            return silnia(n-1, n*akum);
    }
}

public class Zadanie04K9 {
    public static void main(String[] args) {
        /* npaisz program, który demonstruje rekurencję ogonową, obliczając
        kolejne wartości n! dla wartości i zmieniającej się od 1 do 20
         */
        for (int i = 0; i <=20 ; i++) {
            System.out.println(i+"!="+Rekur_ogon.silnia(i));
        }
    }
}
