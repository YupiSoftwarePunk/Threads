public class AccountThread implements Runnable {

    private BankAccount bankAccount;

    public AccountThread(BankAccount bankAccount1)
    {
        this.bankAccount = bankAccount1;
    }


    public void run() {
        BankAccount.deposit(1000);
        BankAccount.withdraw(100);
    }
}
