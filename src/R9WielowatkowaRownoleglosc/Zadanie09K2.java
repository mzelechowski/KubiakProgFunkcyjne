package R9WielowatkowaRownoleglosc;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Zadanie09K2 {
    public static void main(String[] args) {
        /*Korzystając z kodu zadania 9.1 napsiz program,
        któy zarządcza pulą trzech wątków */

//        ExecutorService executor = Executors.newFixedThreadPool(3);  /// tworzenie puli z maksylamlną liczbą 3 wątków
//        ExecutorService executor = Executors.newFixedThreadPool(1);  /// 1 - wykonanie zadania po kolei, JEDEN WATEK
        ExecutorService executor = Executors.newCachedThreadPool(); // dla każdego nowego zadania zostanie utworzony nowy wątek


        executor.execute(new PrintChar('X', 10));
        executor.execute(new PrintChar('Z', 10));
        executor.execute(new PrintNumber(10));

        executor.shutdown();

    }
}
