import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Zadanie02k6 {
    public static void main(String[] args) {
        /*napisz program który korzystajc z wlasciwosci kolekcji ArrayList()
        umieszcza w tej kolekcji liczby od 1 do 100 a nastęnie je sumuje.
         */
        int sum=0, n=100;
        ArrayList<Integer> listInt=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            listInt.add(i);
            sum+=listInt.get(i-1);
        }
        Iterator iterator = listInt.iterator();
        while(iterator.hasNext()){
            int i = (int) iterator.next();
            System.out.print(i +" ");
            if(i%25==0) System.out.println();
        }
        System.out.println("\nSuma licz listy wynosi: "+sum);

        System.out.println("\nWyswietlenie listy przy pomocy Stream");
        listInt.stream().forEach(l-> {System.out.print(l+",");if(l%25==0) System.out.println();});
        int sumStream=listInt.stream().collect(Collectors.summingInt(s->s));
        System.out.println("\nSuma liczb by STREAM listy wynosi: "+sumStream);
    }
}
