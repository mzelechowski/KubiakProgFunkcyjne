package R2PetlaForKolekcje;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie02k2 {
    public static void main(String[] args) {
        int n=100, sumP=0, sumNP=0;
        int [] tab=new int[n];
        for (int i = 1; i <=n ; i++) {
            tab[i-1]=i;
        }
        for (int t:tab) {
            if(t%2==0)
                sumP+=t;
            else
                sumNP+=t;
        }
        System.out.println("Suma elemntow PARZYSTYCH z tablicy 1-100 wynosi: "+sumP);
        System.out.println("Suma elemntow NIEPARZYSTYCH z tablicy 1-100 wynosi: "+sumNP);

        List<Integer> lista = Arrays.stream(tab).boxed().collect(Collectors.toList());
        int sumPF=lista.stream().filter(l->l%2==0).collect(Collectors.summingInt(l->l));
        System.out.println("Suma elemntow PARZYSTYCH sumPF z tablicy 1-100 wynosi: "+sumPF);
        int sumNPF=lista.stream().filter(l->l%2!=0).collect(Collectors.summingInt(l->l));
        System.out.println("Suma elemntow PARZYSTYCH sumNPF z tablicy 1-100 wynosi: "+sumNPF);

    }
}
