import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    public static BankAccount bankAccount;
    private static double balance = 0;
    private static ReentrantLock lock = new ReentrantLock();


    public static void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println("Счет пополнен на: "+ amount);
        } catch (Exception e) {
            System.out.println("Ошибка при пополнении счета");
        }
        lock.unlock();
    }

    public static void withdraw(double amount) {
        lock.lock();
        try {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Со счета было списано: " + amount);
            } else {
                System.out.println("Недостаточно средств для списания: " + amount);
            }
        }
        catch (Exception e) {
        System.out.println("Ошибка при списании со счета");
        }
        lock.unlock();
    }

    public static double getBalance() {
        return balance;
    }
}
