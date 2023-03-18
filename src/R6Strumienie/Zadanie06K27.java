package R6Strumienie;

import java.util.Arrays;
import java.util.List;

class Person {
    public String imie;
    public String nazwisko;
    public String stanowisko;
    public int stazPracy;
    public int pensja;

    public Person(String imie, String nazwisko, String stanowisko, int stazPracy, int pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.stazPracy = stazPracy;
        this.pensja = pensja;
    }
}

public class Zadanie06K27 {
    public static void main(String[] args) {
        List<Person> workres = Arrays.asList(
                new Person("Maciej", "Zelechowski", "Projektant", 10, 5000),
                new Person("Grzegorz", "Wronski", "inzynier", 2, 3000),
                new Person("Stefan", "Lipka", "ksiegowy", 8, 7000),
                new Person("Grzegorz", "Dabrowski", "Sieciowiec", 10, 8500),
                new Person("Kamila", "Morawska", "Stażystka", 1, 2100)
        );
        workres.stream().filter(w -> w.pensja > 4000)
                .filter(w -> w.stazPracy > 3)
                .map(g -> g.imie.toUpperCase() + " " + g.nazwisko.toUpperCase())
                .forEach(System.out::println);
    }
}
