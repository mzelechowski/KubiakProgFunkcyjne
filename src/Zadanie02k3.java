import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zadanie02k3 {
    public static void wpisz(List list){
        for (int i = 0; i < list.size(); i++) {
            if(i < list.size()-1)
                System.out.print(list.get(i)+" , ");
            else
                System.out.print(list.get(i));
        }
    }

    public static void wypiszFOREACH(List list){
            list.stream().forEach(l-> System.out.print(l+" , "));
    }
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 6; i++) {
            list.add((int)Math.floor(Math.random()*101));
        }
        System.out.println("Elementy nieposortowane");
        Zadanie02k3.wpisz(list);
        System.out.println();
        Collections.sort(list);
        System.out.println("Elementy posortowane");
        Zadanie02k3.wpisz(list);
        list.remove(1);
        list.add(10);
        System.out.println();
        Collections.sort(list);
        Zadanie02k3.wypiszFOREACH(list);

    }
}
