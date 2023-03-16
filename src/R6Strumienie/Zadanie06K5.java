package R6Strumienie;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Zadanie06K5 {
    public static void main(String[] args) {
        /*Napisz program, któy tworzy strumień kolejnych dat na podstawie bieżącej daty.
        SKorzystaj z metody Strem.interate i klasy LocalDate, do której należy
        "dodać po jednym dniu" - plusDays(1L). Zastosuj metodę limit(10),
        ograniczając wyświetlenie daty do 10 kolejnych dat.
         */
        Stream.iterate(LocalDate.now(), ld->ld.plusDays(1L)).limit(10).forEach(System.out::println);
    }
}
