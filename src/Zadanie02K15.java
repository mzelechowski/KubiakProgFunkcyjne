import java.util.Stack;

public class Zadanie02K15 {
    public static void main(String[] args) {
        Stack stos = new Stack();
        for (char znak='A'; znak <='Z'; znak++){
            stos.push(znak);
            System.out.println("Wyswietlenie zawartosci stosu: "+stos);
            System.out.println("Litera znajduje się na pozycji: "+ stos.search('A')+".");
            System.out.println("Element znajdujący się na wierzchu stosu to: "+stos.peek()+".");
        }
    }
}
