package R9WielowatkowaRownoleglosc;

class PrintNumber implements Runnable{
    private int number;
    public PrintNumber(int number){
        this.number=number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(number+" ");
            Thread.currentThread().getName();
        }
        System.out.println("Koniec watku10: "+Thread.currentThread().getName());
    }
}

class PrintChar implements Runnable{
    private char letter;
    private int numRepeit;

    public PrintChar(char letter, int numRepeit){
        this.letter=letter;
        this.numRepeit=numRepeit;
    }

    @Override
    public void run() {
        for (int i = 0; i < numRepeit; i++) {
            System.out.print(letter+" ");
            Thread.currentThread().getName();
        }
        System.out.println("Koniec watku: "+Thread.currentThread().getName());
    }
}

public class Zadanie09K1 {
    public static void main(String[] args) {
        Runnable print_X=new PrintChar('X', 10);
        Runnable print_Z=new PrintChar('Z', 10);
        Runnable print_10=new PrintNumber(10);

        Thread thread_1x = new Thread(print_X);
        Thread thread_2z = new Thread(print_Z);
        Thread thread_310 = new Thread(print_10);

        System.out.println("Threads started: ");
        thread_1x.start();
        thread_2z.start();
        thread_310.start();

    }
}
