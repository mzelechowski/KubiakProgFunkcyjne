package R9WielowatkowaRownoleglosc;

import java.sql.Connection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Zadanie09K5 {
    private static Account account = new Account();

    public static void main(String[] args) {
        /*Napisz program ilusturjący komunikację miedzy watkami. Progrma tworzy i uruchamia zadania - pierwsze
        zadanie deponuje kwote na ruachunku, drugie wypłąca środki z tego samego rachunku. Zadanie wypłacające śrdoki
        musi oczekiwać, jeśli wypłacana kwota przekracza aktualny stan konta. Po zdeponowaniu nowych środków,
        zadanie powodujące wpłacenie pieniędzy, powiadamia wątek wypłacający, co wznawaia pracę tego ostatniego.
        Jeżeli stan konta nadal nie pozwala na dokonanei wypłaty, to wątek wypłacający ponownie zaczyna oczekiwać
        na nową wpłatę.
         */
        ExecutorService service = Executors.newFixedThreadPool(2);

        service.execute(new orderPayIn());
        service.execute(new orderPayOut());
        service.shutdown();

        System.out.println("Watek 1.\t\tWątek 2.\t\tStan konta.");

    }

    public static class orderPayIn implements Runnable {
        @Override
        public void run() {

            try {
                while (true) {
                    account.payIn((int) (Math.random() * 10) + 1);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class orderPayOut implements Runnable{
        @Override
        public void run() {
            while(true){
                account.payOut((int) (Math.random() * 10) + 1);
            }
        }
    }


    private static class Account {

        private static Lock blocked = new ReentrantLock();
        private static Condition newIncome = blocked.newCondition();
        private int balance = 0;

        public int getBalance() {
            return this.balance;
        }

        public void payOut(int amount) {
            blocked.lock();
            try {
                while (balance < amount) {
                    System.out.println("\t\t\tOczekiwanie na wpłatę.");
                    newIncome.await();
                }
                balance -= amount;
                System.out.println("\t\t\tWypłata " + amount + "\t\t" + getBalance()*1.00 + "");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                blocked.unlock();
            }
        }

        public void payIn(int amount) {
            blocked.lock();
            try {
                balance += amount;
                System.out.println("Wpłata " + amount + "\t\t\t\t\t" + getBalance()*1.00 + ".");
                newIncome.signalAll();
            } finally {
                blocked.unlock();
            }
        }
    }
}
