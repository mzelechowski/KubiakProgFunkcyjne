import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Zadanie02K16 {
    public static void main(String[] args) {
        /*napisz program który korzystajac z wlasciwosci kolekcji LinkedList()
        umieszcza w niej 10 pseudolowsywch licz 1-100 i wywietla od lewej do
        prawej i od prawej do lewej.
         */
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) Math.floor(Math.random()*101));
        }
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+",");
        }
        System.out.println();
         iterator=list.descendingIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+",");
        }
    }
}
