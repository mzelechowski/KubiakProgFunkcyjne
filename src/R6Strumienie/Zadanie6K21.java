package R6Strumienie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class LiczbyPierwsze{
    private boolean czyPierwsza(int liczba){
        return liczba>1 && IntStream.range(2,liczba).noneMatch(i->liczba%i==0);
    }
    public List<Integer> pierwszeZakres(int poczatek, int koniec){
        return IntStream.rangeClosed(poczatek,koniec).filter(x->czyPierwsza(x)).boxed().collect(Collectors.toList());
    }
}

public class Zadanie6K21 {
    public static void main(String[] args) {
        /*Napisz program któy generuje liczby pierwsze w okreslonych zakresch,
        wykorzystujac strumienie*/
        LiczbyPierwsze lp = new LiczbyPierwsze();
        System.out.println(lp.pierwszeZakres(5,11));
    }
}
