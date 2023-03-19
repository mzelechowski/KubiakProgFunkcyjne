package R8PakietFunction;

import java.util.function.Function;

public class Zadanie08K1 {
    public static void main(String[] args) {
            /*Napisz program, w którym zawarto wyrażenie labmda w postaci x->x*x;*/
        Function<Integer, Integer> fun = x->x*x;
        System.out.println(fun.apply(6));
    }
}
