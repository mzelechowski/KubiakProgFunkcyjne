package R9WielowatkowaRownoleglosc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Zadanie09K4 {
    private static Account account = new Account();

    public static void main(String[] args) {
        /* Zadanie 9.3 rowiąż z użyciem synchronizacji
        Zastosuj klasę ReentrantLock, któa implementuje intefejs Lock i reprezentuje blokadę.
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

    private static class depositPenny implements Runnable {

        @Override
        public void run() {
            account.payment(1);
        }
    }

    private static class Account {

        private static Lock blocked = new ReentrantLock();
        private int balance = 0;

        public int getBalance() {
            return this.balance;
        }

        public void payment(int aomunt) {
            blocked.lock();
            try {
                int newBalance = balance + aomunt;
                Thread.sleep(5);
                balance = newBalance;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                blocked.unlock();
            }
        }
    }
}
