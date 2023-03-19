package R8PakietFunction;

import java.util.function.Consumer;

public class Zadanie08K2 {
    public static void main(String[] args) {
        /*Napsiz program, który zwracja jedną abstraktycjna metodą void accept(T t).
                 */
        Consumer<Integer> zmienna= z -> System.out.println(z);
        zmienna.accept(10);
    }
}
