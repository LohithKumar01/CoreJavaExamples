package threads;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount salaryAccount = new BankAccount(10000);

        Thread thread1 = new Thread(() -> salaryAccount.withdraw(5000));
        Thread thread2 = new Thread(() -> salaryAccount.deposit(8000));
        Thread thread3 = new Thread(() -> salaryAccount.withdraw(2500));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
