package R2PetlaForKolekcje;

import java.util.Collections;
import java.util.LinkedList;

public class Zadanie02k7 {
    public static void main(String[] args) {
        /*napisz program któy korzystając z własciwosci kolekcji LinkedList()
        umieszcza w tej kolekcji alfabetu od A do Z. Do wyświetlenia liter
        od Z do A użyj metody reverse() z klasy Collections.
         */
        LinkedList<Character> list = new LinkedList<>();
        for (char znak='A'; znak <='Z' ; znak++) {
            list.add(znak);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+",");
        }
        Collections.reverse(list);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+",");
        }
        System.out.println();

        list.forEach(l-> System.out.print(l+","));
        Collections.reverse(list);
        System.out.println();
        list.forEach(l-> System.out.print(l+","));

    }
}
