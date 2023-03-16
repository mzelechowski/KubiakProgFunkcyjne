package R6Strumienie;
import java.util.Arrays;
import java.util.List;

public class Zadanie06K1 {
    public static void main(String[] args) {
        /*Napisz program który liczy liczbę znajdujacych się na liście imion o długości
        rónwej tylko szcześciu zankom. Oto lista {"Jakub", "Bartosz", "Magdalena", "Sławomira",
        "Marysia", Dorota");
         */
        List<String> names = Arrays.asList("Jakub", "Bartosz", "Magdalena", "Sławomira",
                "Marysia", "Dorota");
        int counter=0;
        for(String n:names){
            if(n.length()==6)
                counter++;
        }
        System.out.println("Suma imion, których długość jest równa 6 wynosi: "+counter);
    }
}
