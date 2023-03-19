package R8PakietFunction;

import java.util.function.Supplier;

public class Zadanie08K4 {
    public static void main(String[] args) {
        /*Napisz program, który implementuje intefejs java.util.function.Supplier
        i korzysta z metody get().
         */
        Supplier<Double> randomNumber =()-> Math.random();
        System.out.println("Liczba losowa typu dobule: "+ randomNumber.get()+".");
    }
}
