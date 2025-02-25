import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    public static BankAccount bankAccount;
    private static double balance = 0;
    private static ReentrantLock lock;


    public static double deposit(double amount) {
        try {
            lock.lock();
            balance += amount;
            System.out.println("Счет пополнен на: "+ amount);
        } catch (Exception e) {
            System.out.println("Ошибка при блокировке доступа или пополнении счета");
        }
        lock.unlock();
        return balance;
    }

    public static double withdraw(double amount) {
        try {
        lock.lock();
        balance -= amount;
            System.out.println("Со счета было списано: "+ amount);
    } catch (Exception e) {
        System.out.println("Ошибка при блокировке доступа или списании со счета");
    }
        lock.unlock();
        return balance;
}

    public static double getBalance() {
        return balance;
    }
}
