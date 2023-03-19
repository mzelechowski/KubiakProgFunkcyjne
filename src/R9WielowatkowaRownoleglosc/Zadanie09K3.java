package R9WielowatkowaRownoleglosc;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Zadanie09K3 {
    private static Account account = new Account();

    public static void main(String[] args) {
        /*Napisz program tworzący 100 watków, które dodają 1 grosz do konta.
        Zdefiniuj klasę konto do symulacji konta bankowego oraz klasę DodajGrosz,
        dodającą 1 grosz do tego konta. Dodatkowo utwórz klasę główną do tworzenia i
        uruchaniania wątków. Zadanie rowiąż bez synchroniczacji
         */
        ExecutorService service = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            service.execute(new depositPenny());
        }
        service.shutdown();
        while (!service.isTerminated()) {
        }
        System.out.println("Stan konta: " + account.getBalance() + ".");

    }

    private static  class depositPenny implements Runnable {

        @Override
        public void run() {
            account.payment(1);
        }
    }


    private static class Account {
        private int balance = 0;

        public int getBalance() {
            return this.balance;
        }

        public void  payment(int aomunt)  {
            int newBalance = balance + aomunt;
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = newBalance;
        }
    }
}
