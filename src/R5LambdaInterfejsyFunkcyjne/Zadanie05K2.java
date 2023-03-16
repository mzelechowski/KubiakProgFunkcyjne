package R5LambdaInterfejsyFunkcyjne;

interface Liczba1 {
    boolean sprawdzCzy(int a, int b);
}

public class Zadanie05K2 {
    public static void main(String[] args) {
        /*Napisz program, który sprawdza dla liczb x=4 i y =8 czy ich iloczyn jest większy od 30.
         W pgromanie wykorzytaj wyrażenie lambda (używając jawnych argumentów funkcji) i interfejs funkcyjny.
         */
        int x = 8;
        int y = 4;
        Liczba1 warunek = (int a, int b) -> (a * b) > 30;
        if(warunek.sprawdzCzy(x,y)){
            System.out.println("Iloczyn dwóch liczb: "+x+" oraz "+y +" jest wiekszy od 30.");
        }


    }
}
