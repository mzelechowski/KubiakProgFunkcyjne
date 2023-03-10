import java.util.ArrayList;
import java.util.Iterator;

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
            System.out.print(iterator.next()+" ");
        }
        System.out.println("\nSuma licz listy wynosi: "+sum);
    }
}
